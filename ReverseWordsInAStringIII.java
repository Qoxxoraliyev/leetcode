import java.util.HashMap;
import java.util.Map;

public class ReverseWordsInAStringIII {


    public static String reverseWords(String s){

        Map<String,String> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        String[] words=s.split(" ");
        for (int i = 0; i <words.length; i++) {
            for (int j =words[i].length()-1; j>=0; j--) {
                sb.append(words[i].charAt(j));
            }
            if (i!= words.length-1){
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {


        String s="Let's take LeetCode contest";
        String s1="Mr Ding";
        System.out.println(reverseWords(s));
        System.out.println(reverseWords(s1));

    }

}
