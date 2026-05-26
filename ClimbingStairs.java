public class ClimbingStairs {

    public static long fibonacci(int n){
        if (n==1){
            return n;
        }
        int firstNum=1;
        int secondNum=2;
        int nextNum;
        for (int i = 3; i <=n; i++) {
            nextNum=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=nextNum;
        }
        return secondNum;
    }

    public static void main(String[] args) {
        long result=fibonacci(1);
        System.out.println(result);
    }
}
// 0 1 1 2 3 5 8 13