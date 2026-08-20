import java.util.ArrayList;
import java.util.List;

public class LicenseKeyFormatting {

    public static String licenseKeyFormatting(String s,int k){

        List<Character> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i)!='-'){
                list.add(Character.toUpperCase(s.charAt(i)));
            }
        }
        int digit=0;

        for (int i =list.size()-1; i>=0; i--) { // 5

            if (digit==k){
                sb.append('-');
                sb.append(list.get(i));
                digit=0;
            }
            else {
                sb.append(list.get(i));
            }
            digit++;

        }




        for (int i = 0; i <sb.length(); i++) {
            System.out.println(sb.charAt(i));
        }


        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        licenseKeyFormatting("2-5g-3-J",2);

    }

}
