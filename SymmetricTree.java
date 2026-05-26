public class SymmetricTree {

    static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val=val;
        }


    }

    public static boolean isMirror(Node root1,Node root2){
        if (root1==null && root2==null){
            return true;
        } else if (root1==null || root2==null) {
            return false;
        } else if (root1.val!=root2.val) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {

    }
}
