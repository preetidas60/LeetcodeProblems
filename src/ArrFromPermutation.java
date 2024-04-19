import java.util.Arrays;

public class ArrFromPermutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
    static int[] buildArray(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[nums[i]];
        }
        return nums;
    }
}
