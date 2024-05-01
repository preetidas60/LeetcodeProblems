import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,7,11,3};
        int add[] = (twoSum(arr, 6));
        System.out.println(Arrays.toString(add));
    }
        static int[] twoSum(int[] nums, int target) {
            for(int i=1;i<(nums.length);i++){
                for(int j=i;j<nums.length;j++){
                    if(nums[j]+nums[j-i] == target){
                        return new int[]{j-i, j} ;
                    }
                }
            }
            return null;
        }
}
