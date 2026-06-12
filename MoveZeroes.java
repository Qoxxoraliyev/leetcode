public class MoveZeroes {

    public static void moveZeros(int[] nums){


        int j=0;
        for (int i = 0; i <nums.length; i++) {
            if (nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }

        for (int i =j; i <nums.length; i++) {
            nums[i]=0;
        }

    }

    public static void main(String[] args) {


        int[] nums={0,1,0,3,12}; // [1,3,12,0,0]
        moveZeros(nums);

    }


}
