public class Palindrome {

    public static void main(String[] args) {
        boolean result=isPalindrome(121);
        System.out.println(result);
    }

    public static boolean isPalindrome(int n){

        int temp=n;
        int reverse=0;

        if (n<0){
            return false;
        }
            while (n!=0){
                int qoldiq=n%10; // 1 , 2 , 1
                reverse=reverse*10+qoldiq; // 1 , 12 , 121
                n/=10;
            }
        return reverse==temp;
    }


}
