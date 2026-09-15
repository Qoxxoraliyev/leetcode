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
        int leftSum=0;
        int rightSum=0;

        if (root==null){
            return 0;
        }
        else {

            leftSum=findTilt(root.left);
            rightSum=findTilt(root.right);
            int tilt=Math.abs(leftSum-rightSum);
            answer+=tilt;
        }


        return root.val+leftSum+rightSum;
    }

    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        findTilt(root);
        System.out.println(answer);


    }

}
