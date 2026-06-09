public class InvertBinaryTree {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode invertTree(TreeNode root){

        if (root==null){
            return root;
        }
        TreeNode temp=root.left;

        root.left=root.right;
        root.right=temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }



    public static void main(String[] args) {



    }

}
