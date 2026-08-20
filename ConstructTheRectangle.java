import java.util.List;

public class ConstructTheRectangle {


    public static int[] constructRectangle(int area){

        int[] arr=new int[2];
        int max1;
        int max2=Integer.MAX_VALUE;

        for (int i = 1; i <=area; i++) {
            if (area%i==0){
                max1=Math.abs(area/i-i);
                if (max1<max2){
                    max2=max1;
                    arr[0]=area/i;
                    arr[1]=i;
                }
            }

        }

        return arr;
    }

    public static void main(String[] args) {


        constructRectangle(37);
        constructRectangle(4);
        constructRectangle(122122);

    }

}
