import java.util.Arrays;

public class SquareSortedArr {
    public static void main(String[] args) {
        int[] arr = {-3,-4,18, 2, 5, 6};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    static int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        for(int i=0; i<nums.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[smallest]>nums[j]){
                    smallest = j;
                }
            }
            int temp = nums[smallest];
            nums[smallest] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
