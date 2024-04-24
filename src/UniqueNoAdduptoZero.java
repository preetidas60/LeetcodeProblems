import java.util.Arrays;

public class UniqueNoAdduptoZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }
    static int[] sumZero(int n){
        int[] arr = new int[n];
        int sum=0;
        for(int i=0; i<n-1; i++){
            arr[i] = i+1;
            sum+= arr[i];
        }
        arr[n-1] = -sum;
        return arr;
    }
}
