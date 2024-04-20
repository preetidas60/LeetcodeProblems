import java.util.Arrays;

public class ShuffleArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(arr,4)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        for(int i=0, j=n, k=0; k<nums.length; i++, j++){
            arr[k++] = nums[i];
            arr[k++] = nums[j];
        }
        return arr;
    }
}
