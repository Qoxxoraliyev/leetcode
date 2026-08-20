public class MaxConsecutiveOnes {


    public static int findMaxConsecutiveOnes(int[] nums){

        int max1=0;
        int max2=0;
        int count=0;
        for (int i = 0; i <nums.length; i++) {

            if (nums[i]==0){
                max1=count;
                if (max2<max1){
                    max2=max1;
                }
                count=0;
            } else if (i==nums.length-1) {
                count++;
                max1=count;
                if (max2<max1){
                    max2=max1;
                }
            }
            else {
                count++;
            }

        }

        return max2;
    }

    public static void main(String[] args) {


        int[] nums={1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));

    }
}
