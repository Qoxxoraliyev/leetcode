public class IsSubsequence {



    public static boolean isSubsequence(String s,String t){

        int i=0;
        int result=0;
        for (int j = 0; j <t.length(); j++) {
            if (t.charAt(j)==s.charAt(i)){
                result+=1;
                i++;
            }

        }
        return s.length()==result;
    }


    public static void main(String[] args) {

        System.out.println(isSubsequence("abc","ahbgdc"));

    }


}
