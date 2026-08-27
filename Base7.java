public class Base7 {

    public static String convertToBase7(int num){


        StringBuilder sb=new StringBuilder();
        if (num<0){
            num*=-1;
            while (num!=0){
                sb.append(num%7);
                num/=7;
            }
            sb.append("-");
        }
       else {
            while (num!=0){
                sb.append(num%7);
                num/=7;
            }
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(convertToBase7(0));
    }

}
