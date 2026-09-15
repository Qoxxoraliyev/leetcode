import java.util.Arrays;

public class ArrayPartition {

    public static int arrayPairSum(int[] nums){


        Arrays.sort(nums);
        int j=0;
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            if (j< nums.length){
                result+=nums[j];
            }
            j=j+2;
        }


        return result;
    }


    public static void main(String[] args) {

        //int[] nums={1,4,3,2}; // (1, 2) , (3, 4) javob: 4
        int[] nums={6,2,6,5,1,2}; // (1, 2) , (2, 5) , (6, 6) javob: 9
        System.out.println(arrayPairSum(nums));

    }


}
