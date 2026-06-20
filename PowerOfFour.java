public class PowerOfFour {


    public static boolean isPowerOfFour(int n){

        if (n>=4){
            while (n!=1){
                if (n%4!=0){
                    return false;
                }
                n/=4;
            }
        } else if (n==1) {
            return true;
        }
        else {
            return false;
        }
       return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
}
