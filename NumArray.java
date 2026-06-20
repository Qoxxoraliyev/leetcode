public class NumArray {

    private int[] nums;
    private int[] prefix;


    public NumArray(int[] nums){
        this.nums=nums;


        prefix=new int[nums.length];
        prefix[0]=nums[0];

        for (int i = 1; i <nums.length; i++) {
            prefix[i]=prefix[i-1]+nums[i];
        }

    }

    public int sumRange(int left,int right){

        if (left==0){
            return prefix[right];
        }
        else {
            return prefix[right]-prefix[left-1];
        }

    }


    public static void main(String[] args) {

        int[] nums={-2,0, 3, -5, 2, -1};
        NumArray obj=new NumArray(nums);

        obj.sumRange(0,2);
        obj.sumRange(2,5);
        obj.sumRange(0,5);
    }

}
