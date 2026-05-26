import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static List<Integer> inorderTraversal(Node root){
        List<Integer> list=new ArrayList<>();
        if (root!=null){
           inorderTraversal(root.left);
           list.add(root.data);
           inorderTraversal(root.right);
        }
        return list;
    }

    public static void main(String[] args) {


    }

}
