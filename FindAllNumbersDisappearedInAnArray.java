import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedInAnArray {


    public static List<Integer> findDisappearedNumbers(int[] nums){

        Set<Integer> set=new HashSet<>();
        List<Integer> result=new ArrayList<>();
        for (int i = 0; i <nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i =1; i <=nums.length; i++) {

            if (!set.contains(i)){
                result.add(i);
            }

        }

        for (int i = 0; i <result.size(); i++) {
            System.out.println(result.get(i));
        }

        return result;

                }

public static void main(String[] args) {

    int[] nums={4,3,2,7,8,2,3,1}; // 5 , 6
    System.out.println(findDisappearedNumbers(nums));
}

}
