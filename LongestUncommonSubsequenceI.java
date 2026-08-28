public class LongestUncommonSubsequenceI {


    public static int findLUSLength(String a, String b){


        if (a.equals(b)){
            return -1;
        } else if (a.length()>b.length()) {
            return a.length();
        }
        else {
            return b.length();
        }
    }


    public static void main(String[] args) {

        System.out.println(findLUSLength("aaa","aaa"));

    }

}
