public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3,3,2,2};
        System.out.println(removeElement(arr,3));
    }
    static int removeElement(int[] nums, int val) {
        int count = 0;
        int[] arr = new int[nums.length];
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(nums[i] != val){
                count++;
                arr[j++] = nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = arr[i];
        }
        return count;
    }
}
