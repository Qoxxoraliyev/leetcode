import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {


    public static int longestPalindrome(String s){
        Map<Character,Integer> map=new HashMap<>();
        int length=0;
        for (int i = 0; i <s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else {
                 map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }

        for (int i:map.values()){
            if (i%2==0){
                length+=i;
            } else if ((i-1)%2==0) {
                length+=i-1;
            }

        }
        return length+1;
    }

    public static void main(String[] args) {

        System.out.println(longestPalindrome("bb"));

    }

}
