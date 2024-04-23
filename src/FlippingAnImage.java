import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},{1,0,1},{0,0,0}
        };
        flipAndInvertImage(arr);
        for(int[] i : arr){
            for(int j : i){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++){
            reverse(image[i]);
            for(int j=0; j<image[i].length; j++){
                if(image[i][j] == 0){
                    image[i][j] =1;
                }
                else{
                    image[i][j] =0;
                }
            }
        }
        return image;
    }
    static int[] reverse(int[] arr){
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
}
