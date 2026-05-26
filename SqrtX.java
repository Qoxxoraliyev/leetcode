public class SqrtX {

    public static int sqrt(int a){

        if (a<2){
            return a;
        }

        int left=1;
        int right=a/2;


        while (left<=right){
            int mid=left+(right-left)/2;
            if (mid<=a/mid){
                if ((mid+1)>a/(mid+1)){
                    return mid;
                }
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int result=sqrt(2);
        System.out.println(result);


    }
}
