import java.util.Arrays;

public class ConcatenateArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    static int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*(nums.length)];
        int j=nums.length;
        for(int i=0; i<nums.length; i++){
            arr[i] = nums[i];
            arr[i+j] = nums[i];
        }
        return arr;
    }
}
