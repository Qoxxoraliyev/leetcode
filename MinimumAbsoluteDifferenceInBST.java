import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceInBST {



    static class TreeNode{
        int val;
        TreeNode right;
        TreeNode left;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    static List<Integer> list=new ArrayList<>();

    public static List<Integer> inorderTraversal(TreeNode root){
        if (root!=null){
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;

    }

    static int result=Integer.MAX_VALUE;

    public static int getMinimumDifference(TreeNode root){

        for (int i = 0; i <list.size()-1; i++) {
            int difference=Math.abs(list.get(i)-list.get(i+1));
            if (result>difference){
                result=difference;
            }
        }


        return result;
    }


    public static void main(String[] args) {


        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        inorderTraversal(root);

        System.out.println(getMinimumDifference(root));

    }

}
