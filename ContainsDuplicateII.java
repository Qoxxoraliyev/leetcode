import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {


    public static boolean containsNearbyDuplicate(int[] nums, int k){

        Map<Integer,Integer> map=new HashMap<>();
        int index=0;
        for (int i = 0; i <nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],i);// key=1 , index=0
            }
            else {
                int size = Math.abs(i - map.get(nums[i]));
                if (size <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums={1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums,3));

    }

}
