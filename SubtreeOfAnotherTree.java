public class SubtreeOfAnotherTree {


    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }


    }


    public static boolean sameTree(TreeNode root,TreeNode subRoot){

        if (root==null && subRoot==null){
            return true;
        } else if (root==null || subRoot==null) {
            return false;
        } else if (root.val!=subRoot.val) {
            return false;
        }

        return sameTree(root.left,subRoot.left) && sameTree(root.right,subRoot.right);

    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot){

            if (root==null){
                return false;
            }
            if (sameTree(root,subRoot)){
                return true;
            }

            boolean left=sameTree(root.left,subRoot);
            boolean right=sameTree(root.right,subRoot);


        return left==right;
    }

    public static void main(String[] args) {


        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(5);
        root.right=new TreeNode(1);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(2);

        TreeNode subRoot=new TreeNode(4);
        subRoot.left=new TreeNode(1);
        subRoot.right=new TreeNode(2);

        System.out.println(isSubtree(root,subRoot));

    }

}
