public class AddStrings {


    public static String addStrings(String num1,String num2){

        int i=num1.length()-1;
        int j=num2.length()-1;
        int curry=0;

        StringBuilder sb=new StringBuilder();



        while (i>=0 || j>=0 || curry!=0){
            int digit1=0;
            int digit2=0;
            if (i>=0){
                digit1=num1.charAt(i)-'0';
            }
            else {
                digit1=0;
            }
            if (j>=0){
                digit2=num2.charAt(j)-'0';
            }
            else {
                digit2=0;
            }
            curry=(digit2+digit1)/10;
            sb.append((digit1+digit2+curry)%10);
            i--;
            j--;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(addStrings("11","123")); // 134


    }

}
