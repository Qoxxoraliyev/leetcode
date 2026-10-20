public class RangeAdditionII {

    public static int maxCount(int m, int n, int[][] ops){

        int[][] matrix=new int[m][n];

        for (int i = 0; i <ops.length; i++) {
            for (int j = 0; j <ops.length; j++) {
                System.out.println(ops[i][j]);
            }
        }

        return 0;
    }

    public static void main(String[] args) {


        int[][] ops={
                {2,2},
                {3,3}
        };

        System.out.println(maxCount(3,3,ops));


    }

}
