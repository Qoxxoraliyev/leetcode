import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void triangle(int n){

        List<List<Integer>> result=new ArrayList<>();
        for (int i = 0; i <n; i++) {
            List<Integer> list=new ArrayList<>();
            // number
            int number=1;
            for (int k = 0; k <=i; k++) {
                list.add(number);
                number=number*(i-k)/(k+1);
            }
            result.add(list);
        }

        for (int i = 0; i <result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public static void main(String[] args) {
        triangle(5);
    }

}
