public class RepeatedSubstringPattern {


    public static boolean repeatedSubstringPattern(String s){
        int n=s.length();
        System.out.println(s.substring(6));

        for (int i = 1; i <=s.length()/2; i++) {

            StringBuilder sb=new StringBuilder();

            if (n%s.substring(i).length()==0){
                for (int j = 0; j <n/s.substring(i).length(); j++) {

                    sb.append(s.substring(i));

                }
            }

            if (sb.toString().equals(s)){
                return true;
            }
        }


        return false;
    }


    public static void main(String[] args) {


        System.out.println(repeatedSubstringPattern("abcabcabcabc"));

    }
}
