public class ExcelSheetColumnNumber {


    public static int titleToNumber(String columnTitle){

        String letters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int result=0;
        for (int i = 0; i <columnTitle.length(); i++) {
            for (int j = 0; j <letters.length(); j++) {
                if (columnTitle.charAt(i)==letters.charAt(j)){
                    result=result*26+j+1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(titleToNumber("AB")); // 28
        System.out.println(titleToNumber("ZY")); // 701
        System.out.println(titleToNumber("A")); // 1
    }
}
