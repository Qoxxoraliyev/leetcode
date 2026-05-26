import java.util.Arrays;

public class PlusOne {

    public static int[] function(int[] arr){

        if (arr[arr.length-1]<9){
            arr[arr.length-1]+=1;
            return arr;
        } else if (arr[arr.length-1]==9) {
             int carry=arr.length-1;
             while (arr[carry]==9 && arr[0]!=9){
                 arr[carry]=0;
                 carry--;
             }
             if (arr[0]!=9){
                 arr[carry]+=1;
             }
             else {
                 int[] new_arr=new int[arr.length+1];
                 new_arr[0]=1;
                 return new_arr;
             }

        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr={9,9,9,9,9,9};
        int[] result=function(arr);
        System.out.println(Arrays.toString(result));
    }

}
