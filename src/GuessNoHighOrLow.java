public class GuessNoHighOrLow {
    public static void main(String[] args) {
        int num = 15;
        System.out.println(guessNumber(num));
    }
    static int guessNumber(int n) {
        int start = 1;
        int end = n;
        while(start<= end){
            int mid = start +(end - start)/2;
            int value = guess(mid);
            if(value == 0){
                return mid;
            }
            else if(value == -1){
                end = mid -1;
            }
            else{
                start = mid+1;
            }

        }
        return -1;
    }
    static int guess(int n){
        int pick = 10;
        if(n == pick){
            return 0;
        }
        else if(n > pick){
            return -1;
        }
        else{
            return 1;
        }
    }
}
