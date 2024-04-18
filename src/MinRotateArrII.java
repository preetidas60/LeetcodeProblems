public class MinRotateArrII {
    public static void main(String[] args) {
        int[] arr = { 2,2,2,0,1};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] nums) {
        int min = pivot(nums);
        return nums[min+1];
    }
    static int pivot(int[] nums){
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(start < end && nums[start]> nums[start+1]){
                return start;
            }
            if(end > start && nums[end-1] > nums[end]){
                return end-1;
            }
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
                continue;
            }
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid-1]> nums[mid]){
                return mid-1;
            }
            if(nums[start] < nums[mid] || nums[start] == nums[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
