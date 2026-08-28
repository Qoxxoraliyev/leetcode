public class DetectCapital {

    public static boolean detectCapitalUse(String word){

        int result1=0;
        int result2=0;
        int result3=0;
        for (int i = 0; i <word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))){
                result1++;
            }

            if (Character.isUpperCase(word.charAt(i))){
                result2++;
            }

        }

        if (Character.isUpperCase(word.charAt(0))){
            result3++;
        }

        if (result1==word.length()){
            return true;
        } else if (result2==word.length()) {
            return true;
        } else if (result3==1 && result1==word.length()-1) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));

    }

}
