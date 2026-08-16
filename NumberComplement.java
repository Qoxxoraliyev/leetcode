import java.util.ArrayList;
import java.util.List;

public class NumberComplement {

    public static int findComplement(int num){

        List<Integer> list=new ArrayList<>();


        while (num!=0){
            if (num%2==0){
                list.add(1);
            } else if (num%2==1) {
                list.add(0);
            }

            num/=2;
        }

        int result=0;

        for (int i = 0; i<list.size(); i++) {
            result=result+list.get(i)*(int)Math.pow(2,i);
        }

        return result;
    }


    public static void main(String[] args) {


        System.out.println(findComplement(5));


    }

}
