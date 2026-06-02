import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    static Set<Integer> set=new HashSet<>();

    public static boolean isHappy(int n){
        int sum=0;
        while (n!=0){
            sum+=Math.pow(n%10,2);
            n/=10;
        }
        if (sum==1){
            return true;
        } else if (set.contains(sum)) {
            return false;
        }
        else {
            set.add(sum);
        }
        return isHappy(sum);
    }

    public static void main(String[] args) {

        System.out.println(isHappy(2));

    }
}
