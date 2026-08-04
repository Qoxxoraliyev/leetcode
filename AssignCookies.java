public class AssignCookies {

    public static int findContentChildren(int[] g, int[] s){
        int result=0;

        for (int i = 0; i <g.length-1; i++) {

            if (g[i]>g[i+1]){
                int temp=g[i];
                g[i]=g[i+1];
                g[i+1]=temp;
            }

        }

        for (int i = 0; i <s.length-1; i++) {
            if (s[i]>s[i+1]){
                int temp=s[i];
                s[i]=s[i+1];
                s[i+1]=temp;
            }
        }

        int i=0;
        int j=0;
        while (i!=g.length){
            if (g[i]==s[j]){
                result+=1;c
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
