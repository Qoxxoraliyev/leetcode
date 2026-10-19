import java.util.*;

public class LongestHarmoniousSubsequence {


    public static int findLHS(int[] nums){


        Set<Integer> set=new HashSet<>();
        for (int i = 0; i <nums.length; i++) {
            set.add(nums[i]);
        }
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        int max=Integer.MIN_VALUE;
        for (int k:map.keySet()){
            System.out.println(k);
        }

        return 1;
    }

    public static void main(String[] args) {

        int[] nums={1,3,2,2,5,2,3,7}; // {1,2,2,2,3,3,5,7}
        System.out.println(findLHS(nums));

    }

}
