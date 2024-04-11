public class PalindromeNo {
    public static void main(String[] args) {
        int value = 13231;
        System.out.println(isPalindrome(121));
    }
    static boolean isPalindrome(int x) {
        int rem=0;
        int num =0;
        int original = x;
        while(x>0){
            rem = x % 10;
            num = num*10 +rem;
            x= x/10;
        }
        return original == num;
    }
}
