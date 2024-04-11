public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3},{4,5,6}};
        int sum = maximumWealth(arr);
        System.out.println(sum);
    }
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] i: accounts){
            int sum=0;
            for(int j : i){
                sum += j;
            }
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
}
