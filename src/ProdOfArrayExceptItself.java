import java.util.Arrays;

public class ProdOfArrayExceptItself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
        static int[] productExceptSelf(int[] nums) {
            int[] arr = new int[nums.length];
            int productSoFar = 1;

            // Calculate the product of all elements to the left of i
            for(int i = 0; i < nums.length; i++) {
                arr[i] = productSoFar;
                productSoFar *= nums[i];
            }

            // Reset productSoFar to 1 for the product of all elements to the right of i
            productSoFar = 1;

            // Calculate the product of all elements to the right of i, multiplying it with the already calculated product from the left
            for(int i = nums.length - 1; i >= 0; i--) {
                arr[i] *= productSoFar;
                productSoFar *= nums[i];
            }

            return arr;
        }

//    static int[] productExceptSelf(int[] nums) {
//        int[] arr = new int[nums.length];
//        int index = 0;
//        for(int i=0; i<nums.length; i++){
//            int result = 1;
//            for(int j=0; j<nums.length; j++){
//
//                if(index == j){
//                    continue;
//                }
//                result = result * nums[j];
//                arr[i] = result;
//            }
//            index++;
//        }
//
//        return arr;
//    }
}
