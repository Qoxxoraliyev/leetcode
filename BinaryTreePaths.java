import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    static List<String> list=new ArrayList<>();

    public static void helper(TreeNode root,String path){

        if (root==null){
            return;
        }

        if (path==""){
            path=path+root.val;
        }
        else {
            path=path+"->"+root.val;
        }

        if (root.left==null && root.right==null){
            list.add(path);
        }
        else {
            helper(root.left,path);
            helper(root.right,path);
        }


    }

    public static List<String> binaryTreePaths(TreeNode root){

        if (root==null){
            return list;
        }
        else {
            helper(root,"");
        }

        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
        return list;

    }


    public static void main(String[] args) {


        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.right=new TreeNode(5);
        root.right=new TreeNode(3);

        binaryTreePaths(root);
        // ["1->2->5","1->3"]

    }




}
