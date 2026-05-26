public class FirstOccurrenceInAString {

    public static int findFirstIndexOfString(String s1,String s2){

        for (int i = 0; i <=s1.length()-s2.length(); i++) {
            if (s1.substring(i,i+s2.length()).equals(s2)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int result=findFirstIndexOfString("butsad","sad");
        System.out.println(result);
    }


}
