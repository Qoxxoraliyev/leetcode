import java.util.ArrayList;
import java.util.List;

public class MaximumDepthOfNAryTree {


    static class Node{
        int val;
        List<Node> children;

        public Node(int val) {
            this.val = val;
            this.children=new ArrayList<>();
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = new ArrayList<>();
        }
    }


    public static int maxDepth(Node root){

        if (root==null){
            return 0;
        }

        int max=0;
        if (root!=null){
            for (int i = 0; i <root.children.size(); i++) {

                int maxDepth=maxDepth(root.children.get(i));
                if (max<maxDepth){
                    max=maxDepth;
                }
            }
                    }

        return max+1;

    }

    public static void main(String[] args) {

        Node root=new Node(2);

        Node child1=new Node(3);
        Node child2=new Node(4);
        Node child3=new Node(5);

        root.children=new ArrayList<>();
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        System.out.println(maxDepth(root));
    }

}
