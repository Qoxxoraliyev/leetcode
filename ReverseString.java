public class ReverseString {


    public static void reverseString(char[] s){

        char temp;
        int right=s.length-1;
        for (int i = 0; i <s.length/2; i++) {
            temp=s[i];
            s[i]=s[right];
            s[right]=temp;
            right--;
        }



    }

    public static void main(String[] args) {


        char[] letters=new char[]{'h','e','l','l','o'};

        reverseString(letters);

    }
}
