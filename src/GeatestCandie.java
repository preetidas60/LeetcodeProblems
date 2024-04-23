import java.util.ArrayList;
import java.util.List;

public class GeatestCandie {
    public static void main(String[] args) {

        int[] arr = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> set = new ArrayList<>();
        int max =0;
        for(int i=0; i<candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies >= max){
                set.add(true);
            }
            else {
                set.add(false);
            }
        }
        return set;
    }
}
