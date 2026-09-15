public class BinaryTreeTilt {


    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

    }



    static int answer=0;

    public static int findTilt(TreeNode root){
        sum(root);
        return answer;
    }


    public static int sum(TreeNode root){
        int sumLeft=0;
        int sumRight=0;
        if (root==null) {
            return 0;
        }
        else {
            sumLeft=sum(root.left);
            sumRight=sum(root.right);
            int tilt=Math.abs(sumLeft-sumRight);
            answer+=tilt;
        }
        return root.val+sumLeft+sumRight;
    }

    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        System.out.println(findTilt(root));


    }

}
