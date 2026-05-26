public class BalancedBinaryTree {

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

    public static boolean isBalanced(TreeNode root){
        if (root==null){
            return true;
        }
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        if (Math.abs(leftDepth-rightDepth)>1){
            return false;
        }
        else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public static void main(String[] args) {



    }

}
