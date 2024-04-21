import java.util.Arrays;

public class CreateTargetArr {
    public static void main(String[] args) {
        int[] nums = {0,1,0};
        int[] index = {0,1,0};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i=0; i<nums.length; i++){
                    for(int  j=nums.length-2; j>=index[i]; j--){
                        target[j+1] = target[j];
                    }
            target[index[i]] = nums[i];

        }
        return target;
    }
}
