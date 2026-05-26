import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {


        int result=Roman("III");
        System.out.println(result);

        System.out.println("-----------------------");

        result=Roman("LVIII");
        System.out.println(result);

        System.out.println("------------------------");

        result=Roman("MCMXCIV");
        System.out.println(result);

    }

    public static int Roman(String roman) {

        int sum=0;

        Map<Character,Integer> map=new HashMap<>();;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);


        for (int i = 0; i <roman.length(); i++) {

            int first=map.get(roman.charAt(i));


            if (i+1<roman.length()){
                int second=map.get(roman.charAt(i+1));

                if (first<second){
                    sum+=second-first;
                    i++;
                }
                if (first>=second){
                    sum+=first;
                }
            }else {
                sum+=first;
            }

        }

        return sum;
    }

}
