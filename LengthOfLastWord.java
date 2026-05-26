public class LengthOfLastWord {

    public static int function(String s){
        String s1=s.trim();
        for (int i =s1.length()-1; i>=0; i--) {
            if (s1.charAt(i)==' '){
                return s1.length()-i-1;
            }
        }
        return s1.length();
    }

    public static void main(String[] args) {
        int result=function("    day");
        System.out.println(result);
    }

}
