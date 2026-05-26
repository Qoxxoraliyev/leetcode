
public class searchInsertPosition {

    public static int function(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int midPosition=(left+right)/2;
            if (nums[midPosition]==target){
                return midPosition;
            } else if (nums[midPosition]>target) {
                right=midPosition-1;
            }
            else {
                left=midPosition+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums={1,2,4,7,9};
        int result=function(nums,3);
        System.out.println(result);
    }

}
