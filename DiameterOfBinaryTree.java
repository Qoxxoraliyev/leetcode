public class DiameterOfBinaryTree {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static int helper(TreeNode root){
        int height=0;
        if (root!=null){
            int maxLeft=helper(root.left);
            int maxRight=helper(root.right);
            diameter=Math.max(diameter,maxLeft+maxRight); // 3 // 1
            height=Math.max(maxLeft,maxRight)+1; // 3 // 2
        }
        return height;
    }

    static int diameter=0;

    public static int diameterOfBinaryTree(TreeNode root){

        helper(root);

        return diameter;
    }

    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.right=new TreeNode(5);
        root.left.left=new TreeNode(4); // root = [1,2]
        System.out.println(diameterOfBinaryTree(root));
    }

}
