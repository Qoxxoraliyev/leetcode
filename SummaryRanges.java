import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {


    public static List<String> summaryRanges(int[] nums){



        List<String> list=new ArrayList<>();
        int start=nums[0];

        if (nums.length==0){
            return list;
        }

        for (int i = 0; i <nums.length; i++) {

            if (i==nums.length-1 || nums[i+1]!=nums[i]+1){

                if (start==nums[i]){
                    list.add(String.valueOf(start));
                }
                else {
                    list.add(String.valueOf(start+"->"+nums[i]));
                }
            }

            if (i!=nums.length-1){
                start=nums[i+1];
            }


        }


        return list;
    }

    public static void main(String[] args) {

        int[] nums={0,1,2,4,5,7};
        // ["0->2","4->5","7"]
        summaryRanges(nums);
    }


}
