import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15, 20};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int start =0, end = numbers.length-1;
        while(numbers[start] + numbers[end]!= target ){
            if(numbers[start] + numbers[end] < target) start++;
            else end--;
        }
        return new int[]{start+1, end+1};
    }
}
