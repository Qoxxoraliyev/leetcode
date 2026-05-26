public class PathSum {


    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean hasPathSum(TreeNode root, int targetSum){
        if (root==null){
            return false;
        }
        targetSum-=root.val;
        if (root.left==null && root.right==null){
            return targetSum==0;
        }
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
    }



    public static void main(String[] args) {

        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(11);
        root.right=new TreeNode(12);
        root.right.right=new TreeNode(1);
        System.out.println(hasPathSum(root,18));
    }


}
