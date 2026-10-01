import java.util.ArrayList;
import java.util.List;

public class NAryTreePreorderTraversal {

    static class TreeNode{
        int val;
        List<TreeNode> children;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, List<TreeNode> children) {
            this.val = val;
            this.children = children;
        }
    }


    public static void helperPreorder(TreeNode root,List<Integer> list){
        if (root!=null){
            list.add(root.val);
            if (root.children!=null){
                for (int i = 0; i <root.children.size(); i++) {
                    helperPreorder(root.children.get(i),list);
                }
            }
        }
    }





    public static List<Integer> preorder(TreeNode root){

        List<Integer> list=new ArrayList<>();

        helperPreorder(root,list);

        return list;
    }


    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);

        TreeNode child1=new TreeNode(3);
        TreeNode child2=new TreeNode(2);
        TreeNode child3=new TreeNode(4);
        TreeNode child4=new TreeNode(5);
        TreeNode child5=new TreeNode(6);

        root.children=new ArrayList<>();
        root.children.add(child3);
        root.children.add(child2);
        root.children.add(child1);

        child1.children=new ArrayList<>();
        child1.children.add(child4);
        child1.children.add(child5);

        preorder(root);

    }


}
