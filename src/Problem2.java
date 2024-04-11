import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int add[] = (twoSum(arr, 9));
        System.out.println(Arrays.toString(add));
    }
        static int[] twoSum(int[] nums, int target) {
            for(int i=0;i<(nums.length-1);i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        return new int[]{i,j} ;
                    }
                }
            }
            return new int[]{};
        }
}
