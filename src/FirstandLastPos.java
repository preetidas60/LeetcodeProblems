import java.util.Arrays;

public class FirstandLastPos {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 8, 8, 10};
        int[] value = (searchRange(arr, 7));
        System.out.println(Arrays.toString(value));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans ={-1,-1};
        int start = searchMid(nums, target, true);
        int end = searchMid(nums, target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int searchMid(int[] nums, int target, boolean searchFirstInd){
        int ans =-1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                ans = mid;
                if(searchFirstInd){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
