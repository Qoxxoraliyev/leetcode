import java.util.*;

public class LongestHarmoniousSubsequence {


    public static int findLHS(int[] nums){

        Arrays.sort(nums);
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }


        for (int i:map.keySet()){
            list.add(i);
        }
        Collections.sort(list);


        int max=0;





        for (int i = 0; i <list.size()-1; i++) {
            if (list.get(i+1)==list.get(i)+1){
                int value=map.get(list.get(i+1))+map.get(list.get(i));
                if (max<value){
                    max=value;
                }
            }
        }



        return max;
    }

    public static void main(String[] args) {

        int[] nums={-3,-1,-1,-1,-3,-2}; // {1,2,2,2,3,3,5,7}
        System.out.println(findLHS(nums));

    }

}
