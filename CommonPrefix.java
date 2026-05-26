public class CommonPrefix {

    public static void main(String[] args) {

        String result=Prefix(new String[]{"flower","flow","flight"});
        System.out.println(result);
    }


    public static String Prefix(String[] arr){

        String px="";
        String res="";

        for (int i = 0; i <arr[0].length(); i++) {

            int index=0;
            px+=arr[0].charAt(i);

            for (int j = 0; j <arr.length; j++) {
                if (arr[j].startsWith(px)){
                    index++;
                }
                else {
                    return "";
                }
            }

            if (index>=arr.length){
                res=px;
            }


            System.out.println(res);
        }
        return res;
    }


}
