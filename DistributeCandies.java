import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public static int distributeCandies(int[] candyType){


        int count=candyType.length/2;
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i <candyType.length; i++) {
            set.add(candyType[i]);
        }
        if (count==set.size()){
            return count;
        } else if (count>set.size()) {
            return set.size();
        }

        return count;
    }


    public static void main(String[] args) {

        int[] candyType={1,1,2,2,3,3};
        //int[] candyType={1,1,2,3};
        //int[] candytype={6,6,6,6};
        System.out.println(distributeCandies(candyType));
    }


}
