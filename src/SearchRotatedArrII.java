public class SearchRotatedArrII {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2,9,2,2};
        System.out.println(search(arr,9));
    }
    static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start +(end -start)/2;
            if(target == nums[mid]){
                return true;
            }
            if(nums[start] == nums[mid] && nums[mid]== nums[end]){
                start++;
                end --;
                continue;
            }
            if (nums[start] <= nums[mid]) { // Left half is sorted
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Right half is sorted
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }
        return false;
    }
}
