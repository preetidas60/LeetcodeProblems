public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,2,3};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
        int length = nums.length;
        int sum = 0;
        int totalSum = (length*(length+1))/2;
        System.out.println(totalSum);
        for(int i=0; i<=nums.length-1;i++){
            sum = sum + nums[i];
        }
        int value = totalSum - sum;
        return value;
    }
}
