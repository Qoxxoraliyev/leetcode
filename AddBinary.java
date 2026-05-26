public class AddBinary {

    public static String function(String a,String b) {

        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        String result="";

        while (i>=0 || j>=0 || carry!=0){
            int digitA=(i>=0)?a.charAt(i)-'0':0;
            int digitB=(j>=0)?b.charAt(j)-'0':0;
            int sum=digitA+digitB+carry;
            System.out.println("sum"+": "+sum);
            result+=String.valueOf(sum%2);
            carry=sum/2;
            i--;
            j--;
        }

        return new StringBuilder(result).reverse().toString();
    }

    public static void main(String[] args) {

        String result=function("11","1");
        System.out.println(result);
    }

}
