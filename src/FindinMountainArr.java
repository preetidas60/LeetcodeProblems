public class FindinMountainArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(findInMountainArray(5,arr));
    }
    static int findInMountainArray(int target, int[] mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int result = 0;
        int firsttry = binarySearch(mountainArr, target, 0, peak);
        if (firsttry != -1) {
            return firsttry;
        }
        return binarySearch(mountainArr, target, peak + 1, mountainArr.length - 1);
    }
    static int binarySearch(int[] mountainArr, int target, int start, int end) {
        boolean isAsc = mountainArr[end] > mountainArr[start];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < mountainArr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > mountainArr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    static int peakIndexInMountainArray(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] > mountainArr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
