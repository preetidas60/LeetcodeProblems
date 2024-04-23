public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(diagonalSum(arr));
    }
    static int diagonalSum(int[][] mat) {
        int sum =0;
        for(int i=0; i<mat.length; i++){
            sum += mat[i][i];
            sum += mat[i][mat.length-i-1];
        }
        if(mat.length % 2 != 0){
            sum -= mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}
