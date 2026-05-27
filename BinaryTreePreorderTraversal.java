import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static List<Integer> preorderTraversal(TreeNode root){

        List<Integer> list=new ArrayList<>();
        if (root!=null){
            list.add(root.val);
            List<Integer> list1=preorderTraversal(root.left);
            List<Integer> list2=preorderTraversal(root.right);
            for (int i = 0; i <list1.size(); i++) {
                if (list1.get(i)!=null){
                    list.add(list1.get(i));
                }
            }
            for (int i = 0; i <list2.size(); i++) {
                if (list2.get(i)!=null){
                    list.add(list2.get(i));
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(12);
        root.left.right=new TreeNode(1);
        root.right=new TreeNode(12);
        root.right.right=new TreeNode(22);
        root.right.right.right=new TreeNode(0);

        System.out.println(preorderTraversal(root));
    }


}
