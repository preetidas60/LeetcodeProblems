public class PeakMountain {
    public static void main(String[] args) {
        int[] arr = {0,2,4,6,10,11, 15,7,5,3,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
        int result = 0;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                result = mid;
                end = mid-1;
            }
            else {
                start = mid +1;
            }
        }
        return result;
    }
}
