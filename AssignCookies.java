import java.util.Arrays;

public class AssignCookies {

    public static int findContentChildren(int[] g, int[] s){
        int result=0;


        Arrays.sort(g);
        Arrays.sort(s);

        int i=0;
        int j=0;
        while (i!=g.length){
            if (g[i]==s[j]){

                result++;

                i++;
                j++;
            }
            else {
                i++;
            }
        }

        return result;
    }


    public static void main(String[] args) {

       int[] g={4,1,2,3};
       int[] s={1,1};

        System.out.println(findContentChildren(g,s));

    }


}
