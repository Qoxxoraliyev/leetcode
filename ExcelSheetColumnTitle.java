public class ExcelSheetColumnTitle {


    public static String convertToTitle(int columnNumber){
       String letters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       StringBuilder result=new StringBuilder();

       while (columnNumber!=0){
           columnNumber-=1;
           System.out.println(columnNumber%26);
           result.insert(0,letters.charAt(columnNumber%26));
           columnNumber/=26;
       }
       return result.toString();
    }

    public static void main(String[] args) {


        //System.out.println(convertToTitle(1)); // A
        System.out.println(convertToTitle(28)); // AB
        //System.out.println(convertToTitle(701)); // ZY
    }
}
