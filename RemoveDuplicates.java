
public class RemoveDuplicates {

    public static int removeD(int[] arr) {

        int i=0;
        for (int j = 1; j <arr.length; j++) {
            if (arr[i]!=arr[j]){
                arr[i]=arr[j];
                i++;
            }
        }
        return i-1;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 4, 5, 5, 5};
        int result = removeD(arr);
        System.out.println(result);
    }


}
