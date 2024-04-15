import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    static int[] runningSum(int[] nums) {
        int sum =0;
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            arr[i]= sum;
        }
        return arr;
    }
}
