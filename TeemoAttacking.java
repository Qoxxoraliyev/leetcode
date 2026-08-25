

public class TeemoAttacking {

    public static int findPoisonedDuration(int[] timeSeries,int duration){

        int total=duration;
        for (int i = 1; i <timeSeries.length; i++) {

            int difference=timeSeries[i]-timeSeries[i-1];
            total+=Math.min(duration,difference);

        }



        return total;

    }

    public static void main(String[] args) {

        int[] nums={1,2};
        int duration=2;
        System.out.println(findPoisonedDuration(nums,duration));


    }

}
