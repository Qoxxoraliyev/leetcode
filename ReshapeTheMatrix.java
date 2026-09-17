import java.util.ArrayList;
import java.util.List;

public class ReshapeTheMatrix {




    public static int[][] matrixReshape(int[][] mat, int r, int c){

        int[][] answer=new int[1][4];
        int matElements=mat.length*mat[0].length;
        List<Integer> list=new ArrayList<>();
        int index=0;

        if (r*c!=matElements){
            return mat;
        }
        else {
            for (int i=0;i<mat.length;i++){
                for (int j = 0; j <mat[0].length; j++) {
                    list.add(mat[i][j]);
                }
            }
        }


        for (int i = 0; i <r; i++) {
            for (int j = 0; j <c; j++) {
                answer[i][j]=list.get(index);
                index++;
            }
        }


         return answer;

    }

    public static void main(String[] args) {


        int[][] nums={
                {1,2},
                {3,4}
        };

        int r=1;
        int c=4;

        matrixReshape(nums,r,c);

    }

}
