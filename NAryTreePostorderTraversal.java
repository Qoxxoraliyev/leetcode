import java.util.ArrayList;
import java.util.List;

public class NAryTreePostorderTraversal {


    static class TreeNode {

        int val;
        List<TreeNode> children;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void postorderHelper(TreeNode root,List<Integer> list){


        if (root!=null){

            if (root.children!=null){

                for (int i = 0; i <root.children.size(); i++) {

                    postorderHelper(root.children.get(i),list);

                }
                list.add(root.val);
            }

        }

    }

    public static List<Integer> postorder(TreeNode root){


        List<Integer> list=new ArrayList<>();

        postorderHelper(root,list);

        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }

        return list;
    }

    public static void main(String[] args) {

        TreeNode root=new TreeNode(1);

        TreeNode child1=new TreeNode(3);
        TreeNode child2=new TreeNode(2);
        TreeNode child3=new TreeNode(4);

        TreeNode child4=new TreeNode(5);
        TreeNode child5=new TreeNode(6);

        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        child1.children.add(child4);
        child1.children.add(child5);

        postorder(root);


    }

}
