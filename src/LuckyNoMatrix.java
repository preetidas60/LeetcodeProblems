import java.util.ArrayList;
import java.util.List;

public class LuckyNoMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        System.out.println(luckyNumbers(arr));
    }
    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNumber = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            int minRow = matrix[i][0];
            for(int j=1; j<matrix[i].length; j++){
                if(matrix[i][j] < minRow){
                    minRow = matrix[i][j];
                }
            }
            boolean isLucky = true;
            for(int j=0; j<matrix[i].length; j++){

                for(int k=0; k<matrix.length; k++){
                    if(matrix[k][j] > minRow){
                        isLucky = false;
                        break;
                    }
                }
                if(isLucky){
                    luckyNumber.add(minRow);
                    break;
                }
            }
        }
        return luckyNumber;
    }
}
