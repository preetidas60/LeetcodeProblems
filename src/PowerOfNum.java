public class PowerOfNum {
    public static void main(String[] args) {
        System.out.println(myPow(2,-2));
    }
    static double myPow(double x, int n) {
            double value = 1;
            if(n==0){
                return 1;
            }
            else if(n>0){
                for(int i=1; i<=n; i++){
                    value = value * x;
                }
            }
            else {
                x = 1/x;
                n = -n;
                for(int i=1; i<=n; i++){
                    value = value * x;
                }
            }
            return value;
    }
}
