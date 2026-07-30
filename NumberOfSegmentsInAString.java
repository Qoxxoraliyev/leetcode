public class NumberOfSegmentsInAString {


    public static int countSegments(String s){
        int result=0;

        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i)!=' '){


                if (i==0 || s.charAt(i-1)==' '){
                    result++;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {


        System.out.println(countSegments("Hello, my name is John"));

    }
}
