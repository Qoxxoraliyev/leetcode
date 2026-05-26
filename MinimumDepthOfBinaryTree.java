public class MinimumDepthOfBinaryTree {


    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static int minDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        int leftDepth=minDepth(root.left);
        int rightDepth=minDepth(root.right);
        return Math.min(leftDepth,rightDepth)+1;
    }

    public static void main(String[] args) {

        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(4);
        root.right=new TreeNode(12);
        root.right.right=new TreeNode(11);
        root.right.left=new TreeNode(13);
        System.out.println(minDepth(root));
    }
}
