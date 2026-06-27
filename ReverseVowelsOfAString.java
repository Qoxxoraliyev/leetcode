public class ReverseVowelsOfAString {



    public static boolean helper(char letter){

        Character[] vowels={'a','e','i','o','u'};

        for (int i = 0; i <vowels.length; i++) {
            if (Character.toLowerCase(letter)==vowels[i]){
                return true;
            }
        }

        return false;
    }

    public static String reverseVowels(String s){

        char[] first=new char[s.length()];
        StringBuilder result=new StringBuilder();

        for (int i = 0; i <s.length(); i++) {
            first[i]=s.charAt(i);
        }


        int left=0;
        int right=s.length()-1;

        while (left<right){
            if (!helper(first[left])){
                left++;
            }
            else if (!helper(first[right])){
                right--;
            } else if (helper(first[left]) && helper(first[right])){
                char temp=first[left];
                first[left]=first[right];
                first[right]=temp;
                left++;
                right--;
            }
        }

        for (int i = 0; i <first.length; i++) {
            result.append(first[i]);
        }


        return result.toString();
    }

    public static void main(String[] args) {


        System.out.println(reverseVowels("IceCreAm"));

    }


}
