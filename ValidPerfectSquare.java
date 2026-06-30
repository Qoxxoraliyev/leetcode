public class ValidPerfectSquare {



    public static boolean helper(int num,int left,int right){
        if (left>right){
            return false;
        }

        int mid=(left+right)/2;
        if (mid*mid==num){
            return true;
        } else if (mid*mid<num) {
            return helper(num,mid+1,num);
        } else if (mid*mid>num) {
            return helper(mid,left,mid);
        }
        else {
            return false;
        }
    }

    public static boolean isPerfectSquare(int num){

        int left=1;
        int right=num;
        int mid=(right+left)/2;
        if (mid*mid==num){
            return true;
        } else if (mid*mid<num) {
            return helper(num,mid+1,num);
        } else if (mid*mid>num) {
            return helper(mid,left,mid);
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPerfectSquare(16));
    }
}
