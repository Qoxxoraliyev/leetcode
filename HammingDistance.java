public class HammingDistance {


    public static int hammingDistance(int x,int y){

        int digit =x^y;
        int result=0;
        while (digit !=0){
            if (digit %2==1){
                result++;
            }
            digit/=2;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(hammingDistance(1,4));

    }

}
