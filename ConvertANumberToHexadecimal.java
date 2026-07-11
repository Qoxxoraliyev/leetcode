import java.util.HashMap;
import java.util.Map;

public class ConvertANumberToHexadecimal {



    public static String toHex(int num){

        Map<Integer,Character> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i <10; i++) {
            map.put(i,(char)('0'+i));
        }

        for (int i = 10; i <=15; i++) {
            map.put(i,(char)('a'+(i-10)));
        }

        while (num!=0){
            sb.insert(0,map.get(num&15));
            num>>>=4;
        }
        return sb.toString();
    }


    public static void main(String[] args) {

        System.out.println(toHex(-1));


    }

}
