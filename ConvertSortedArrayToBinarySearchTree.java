public class ConvertSortedArrayToBinarySearchTree {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode build(int[] nums,int left,int right){
        if (left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=build(nums,left,mid-1);
        root.right=build(nums,mid+1,right);
        return root;
    }

    public static TreeNode sortedArrayToBST(int[] nums){
        return build(nums,0,nums.length-1);
    }

    public static void main(String[] args) {
        int[] nums={-10,-3,0,5,9};
    }
}
