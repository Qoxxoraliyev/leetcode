public class AddDigits {


    public static int addDigits(int num){

        int sum=0;
        while (num>=1){
            sum+=num%10;
            num/=10;
        }
        if (sum<10){
            return sum;
        }
        else {
            sum=addDigits(sum);
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(addDigits(0));

    }

}
