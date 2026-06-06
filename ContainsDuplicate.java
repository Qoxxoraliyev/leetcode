import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {


    public static boolean containsDuplicate(int[] nums){

        Set<Integer> set=new HashSet<>();
        for (int i = 0; i <nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size()!=nums.length;
    }

    public static void main(String[] args) {

        int[] nums={1,2,3,4};
        System.out.println(containsDuplicate(nums));

    }
}
