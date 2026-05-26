import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {


    public static List<Integer> getRow(int indexRow){
        List<Integer> list=new ArrayList<>();
        for (int i =0; i<=indexRow; i++) {

            long number=1;
            for (int j =0; j<=i; j++) {
                if (i==indexRow){
                    list.add((int) number);
                }
                number=number*(i-j)/(j+1);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        getRow(3);

    }
}
