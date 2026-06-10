public class PowerOfTwo {


    public static boolean isPowerOfTwo(int n){

        while (n!=1){
            if (n%2==1){
                return false;
            }
            n/=2;
        }
        return true;
    }

    public static void main(String[] args) {


        System.out.println(isPowerOfTwo(1));

    }


}
