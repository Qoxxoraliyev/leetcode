public class UglyNumber {

    // 2 3 5

    public static boolean isUgly(int n){

        while (n>1){
            if (n%2!=0 && n%3!=0 && n%5!=0){
                return false;
            } else if (n%2==0) {
                n/=2;
            } else if (n%3==0) {
                n/=3;
            } else if (n%5==0) {
                n/=5;
            }
        }
        return n==1;
    }

    public static void main(String[] args) {


        System.out.println(isUgly(6));

    }

}
