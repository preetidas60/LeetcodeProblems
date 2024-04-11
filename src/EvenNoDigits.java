public class EvenNoDigits {
    public static void main(String[] args) {
        int[] arr = {23,34,567,1234};
        System.out.println();
        System.out.println(findNumbers(arr));
    }
        static int findNumbers(int[] nums) {
            int count =0;
            for (int i: nums){
                if(even(i)){
                    count++;
                }
            }
            return count;
        }
        static int digits(int num){
            int count =0;
            while(num>0){
                count++;
                num= num/10;
            }
            return count;
        }
        static boolean even(int num){
            int number = digits(num);
            return number % 2 == 0;
        }
    }
