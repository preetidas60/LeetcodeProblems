import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate from the end of the array
        for (int i = n - 1; i >= 0; i--) {
            // Increment the digit and check for carry-over
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No need to carry-over, return the updated array
            } else {
                digits[i] = 0; // Carry-over, set the current digit to 0
            }
        }

        // If we reach here, it means all digits were 9, so we need to add an extra digit
        int[] result = new int[n + 1];
        result[0] = 1; // Set the first digit to 1
        return result;
    }
}

//        int num = 0;
//        for(int i=0; i<digits.length; i++){
//            num = num * 10 + digits[i];
//        }
//        num = num + 1;
//        int[] values = new int[String.valueOf(num).length()];
//        for(int i=values.length-1; i>=0; i--){
//            values[i] = num % 10;
//            num = num/10;
//        }
//        return values;}
