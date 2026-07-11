public class SumOfLeftLeaves {


    static class TreeNode{

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){}

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static int sumOfLeftLeaves(TreeNode root){

        int sum=0;

        if (root==null){
            return 0;
        }

        TreeNode current=root.left;

        if (current!=null){
            if (current.left==null && current.right==null){
                sum+=current.val;
            }
        }

        int left=sumOfLeftLeaves(root.left);
        int right=sumOfLeftLeaves(root.right);

        return sum+left+right;
    }


    public static void main(String[] args) {

        TreeNode root=new TreeNode(3);
        root.right=new TreeNode(20);
        root.left=new TreeNode(9);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(sumOfLeftLeaves(root));

    }

}
