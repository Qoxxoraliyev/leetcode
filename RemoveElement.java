public class RemoveElement {

    public static int remove(int[] nums, int val) {

        int i=0;
        for (int j = 0; j <nums.length; j++) {
            if (nums[j]!=val){ // val=2
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 2, 3, 3, 4, 4, 5, 6};
        int result = remove(nums, 2);
        System.out.println(result);
    }


}
