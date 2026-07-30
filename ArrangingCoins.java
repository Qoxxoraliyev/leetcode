public class ArrangingCoins {

    public static int arrangeCoins(int n){

        int result=n;

        for (int i =1; i <=n; i++) {
            result-=i;
            if (result<0){
                return i-1;
            }
        }

        return 1;
    }


    public static void main(String[] args) {

        System.out.println(arrangeCoins(8));

    }

}
