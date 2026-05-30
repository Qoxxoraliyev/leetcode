import java.util.HashMap;
import java.util.Map;

public class MajorityElement {


    public static int majorityElement(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for (int i = 0; i <nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else {
                map.put(nums[i],1);
            }
        }
        int maxKey=nums[0];
        for(int key:map.keySet()){
            if (maxKey<key){
                maxKey=key;
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {

        int[] nums={3,3,4};
        System.out.println(majorityElement(nums));

    }
}
