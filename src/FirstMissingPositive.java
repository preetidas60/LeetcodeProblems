public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {0,2,2,4,0,1,0,1,3};
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] nums) {
        boolean[] arr = new boolean[nums.length+1];
        for(int i=0; i< nums.length; i++){
            if(nums[i] > 0 && nums[i]<=nums.length){
                arr[nums[i]] = true;
            }
        }
        for(int i=1; i< arr.length; i++){
            if(!arr[i]){
                return i;
            }
        }
        return nums.length+1;
    }
}
