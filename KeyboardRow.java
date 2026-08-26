public class KeyboardRow {


    public static String[] findWords(String[] words){

        String[] result=new String[words.length];

        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";

        int resultIndex=0;
        for (int i = 0; i <words.length; i++) {

            boolean have1=true;
            boolean have2=true;
            boolean have3=true;

            for (int j = 0; j <words[i].length(); j++) {

                   if (row1.indexOf(words[i].toLowerCase().charAt(j))==-1){
                       have1=false;
                   }

                   if (row2.indexOf(words[i].toLowerCase().charAt(j))==-1){
                       have2=false;
                   }

                   if (row3.indexOf(words[i].toLowerCase().charAt(j))==-1){
                       have3=false;
                   }

            }

            if (have1==true){
                result[resultIndex]=words[i];
                resultIndex++;
            }
            if (have2==true){
                result[resultIndex]=words[i];
                resultIndex++;
            }
            if (have3==true){
                result[resultIndex]=words[i];
                resultIndex++;
            }



        }

        for (int i = 0; i <result.length; i++) {
            System.out.println(result[i]);
        }
        return result;
    }

    public static void main(String[] args) {


        String[] words={"Hello","Alaska","Dad","Peace"};
        findWords(words);

    }

}
