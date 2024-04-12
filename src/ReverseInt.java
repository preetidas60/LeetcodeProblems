public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverse(1463847412));
    }
    static int reverse(int x) {
        int num=0, rem =0;
        while(x!=0){
            rem = x%10;
            if (num > Integer.MAX_VALUE/10  || num < Integer.MIN_VALUE/10 ) return 0;
            num = num*10 + rem;
            x = x / 10;
        }
        return num;
    }
}
