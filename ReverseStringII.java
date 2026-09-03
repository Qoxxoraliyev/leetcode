import java.util.ArrayList;
import java.util.List;

public class ReverseStringII {


    public static String reverseStr(String s,int k){


        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();

        int start=0;
        while (start<s.length()){
            int end=start+2*k;
            if (end>s.length()){
                end=s.length();
                String block=s.substring(start,end);
                list.add(block);
            }
            else {
                String block=s.substring(start,end);
                list.add(block);
            }

            start+=2*k;
        }




        for (int i = 0; i <list.size(); i++) {
            if (k<list.get(i).length()){
                for (int j =k-1; j>=0; j--) {
                    sb.append(list.get(i).charAt(j));
                }
                for (int j =k; j <list.get(i).length(); j++) {
                    sb.append(list.get(i).charAt(j));
                }
            }
              else {
                for (int j =list.get(i).length()-1; j>=0; j--) {
                    sb.append(list.get(i).charAt(j));
                }
            }
        }




        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(reverseStr("abc",5));

    }

}
