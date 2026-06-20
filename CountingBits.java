public class CountingBits {


    public static int[] countBits(int n){

        int[] result=new int[n+1];

        for (int i = 0; i <=n; i++) {
            int count=0;
            int p=i;
            while (p!=0){
                if (p%2==1){
                    count++;
                }
                p/=2;
            }
            result[i]=count;
        }

        for (int i = 0; i <result.length; i++) {
            System.out.println(result[i]);
        }

        return result;

    }


    public static void main(String[] args) {

        countBits(2);

    }

}
