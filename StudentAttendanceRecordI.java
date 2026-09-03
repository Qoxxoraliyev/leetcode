public class StudentAttendanceRecordI {


    public static boolean checkRecord(String s){

        int countA=0;
        boolean late=false;
        for (int i = 0; i <s.length(); i++) {

            if (s.charAt(i)=='A'){
                countA++;
            }

            if (i+2<s.length()){
                if (s.charAt(i)=='L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L'){
                    late=true;
                }
            }


        }

        return countA<2 && late==false;
    }

    public static void main(String[] args) {


        System.out.println(checkRecord("AA")); // false
        System.out.println(checkRecord("PPALLL")); // false
        System.out.println(checkRecord("PPALLP")); // true
        System.out.println(checkRecord("PPPLPPPPLPLPPPPPLPPPPPPPPLPPAP")); // true

    }

}
