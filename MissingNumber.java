public class MissingNumber {


    public static int missingNumber(int[] nums){

        int sum=0;
        int sum1=0;
        for (int i = 0; i <nums.length; i++) {
            sum+=nums[i];
            sum1+=i;
        }

        return sum1+nums.length-sum;
    }

    public static void main(String[] args) {

        int[] nums={9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));

    }

}
