import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

    public static String[] findRelativeRanks(int[] score){
        String[] result=new String[score.length];
        Map<Integer,String> map=new HashMap<>();
        int[] copy=score;
        Arrays.sort(score);
        int j=0;
        for (int i =score.length-1; i>=0; i--) {

            if (j==0){
                map.put(score[i],"Gold Medal");
            } else if (j==1) {
                map.put(score[i],"Bronze Medal");
            } else if (j==2) {
                map.put(score[i],"Silver Medal");
            }
            else {
                map.put(score[i],String.valueOf(j+1));
            }
            j++;
        }

        for (int i = 0; i <copy.length; i++) {
            if (map.containsKey(copy[i])){
                result[i]=map.get(copy[i]);
            }
        }


        return result;
    }

    public static void main(String[] args) {

        int[] score={5,4,3,2,1};
        findRelativeRanks(score);

    }

}
