import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,89,0};
        for(int i=0; i<arr.length-1; i++){
            arr[i] = Math.min(arr[i],arr[i+1]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
