public class MaximumDepthOfBinaryTree {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static int maxDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        return Math.max(leftDepth,rightDepth)+1;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(5);
        root.right=new TreeNode(12);
        root.left.left=new TreeNode(0);
        root.right.right=new TreeNode(13);
        root.right.right.right=new TreeNode(14);
        System.out.println(maxDepth(root));
    }


}
