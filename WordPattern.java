import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPattern {


    public static boolean wordPattern(String pattern,String s){

        Map<Character,String> map1=new HashMap<>();
        Map<String,Character> map2=new HashMap<>();

        List<String> words=new ArrayList<>();

        for (String word:s.split(" ")){
            words.add(word);
        }

        if (pattern.length()!=words.size()){
            return false;
        }


        for (int i = 0; i < words.size(); i++) {

          Character letter=pattern.charAt(i);
          String word=words.get(i);

          if (!map1.containsKey(letter)){
              map1.put(letter,word);
          }
          else {
              if (!map1.get(letter).equals(word)){
                  return false;
              }
          }

          if (!map2.containsKey(word)){
              map2.put(word,letter);
          }
          else {
              if (map2.get(word)!=letter){
                  return false;
              }
          }

        }

        return true;
    }


    public static void main(String[] args) {

        System.out.println(wordPattern("abba","dog cat cat dog")); // ["dog", "cat", "cat", "dog"]

    }

}
