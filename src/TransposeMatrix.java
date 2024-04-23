public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},{4,5,6}
        };
        transpose(arr);
        for(int[] i: arr){
            for(int j: i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static int[][] transpose(int[][] matrix) {
        int[][] arr = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
    }
}
