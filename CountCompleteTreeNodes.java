public class CountCompleteTreeNodes {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static int leftHeight(TreeNode root){
       int height=0;
       while (root!=null){
           height++;
           root=root.left;
       }
       return height;
    }

    public static int rightHeight(TreeNode root){
        int height=0;
        while (root!=null){
            height++;
            root=root.right;
        }
        return height;
    }

    public static int countNodes(TreeNode root){
        if (root==null){
            return 0;
        }
        int left=leftHeight(root);
        int right=rightHeight(root);
        if (left==right){
            return (1<<left)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }


    // 1,2,3,4,5,6
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.left.right=new TreeNode(5);
        System.out.println(countNodes(root));
    }


}
