public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
    static int maxSubArray(int[] nums) {
        int max = nums[0];
        int value = nums[0];
        for (int i = 1; i < nums.length; i++) {
            value += nums[i];
            if (nums[i] > value) {
                value = nums[i];
            }
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
