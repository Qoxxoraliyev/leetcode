public class ThirdMaximumNumber {


    public static int thirdMax(int[] nums){


        int first=Integer.MIN_VALUE; // 1,1,2,3
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for (int i = 0; i <nums.length; i++) {

            if (first<nums[i]){
                third=second; // 1
                second=first; // 2
                first=nums[i]; // 3
            } else if (first>nums[i] && second<nums[i]) {
                third=second;
                second=nums[i];
            } else if (second>nums[i] && third<nums[i]) {
                third=nums[i];
            }

        }

        if (third==Integer.MIN_VALUE){
            return first;
        }

        return third;
    }


    public static void main(String[] args) {

        int[] nums={1,1,2};

        System.out.println(thirdMax(nums));

    }

}
