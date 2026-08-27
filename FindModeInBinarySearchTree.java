import java.util.*;

public class FindModeInBinarySearchTree {


    static   class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

    }



    static Map<Integer,Integer> map=new HashMap<>();

    public static void helper(TreeNode root){
        if (root!=null){
            helper(root.left);
            if (!map.containsKey(root.val)){
                map.put(root.val, 1);
            }
            else {
                map.put(root.val,map.get(root.val)+1);
            }
            helper(root.right);
        }
    }

    public static int[] findMode(TreeNode root){


        List<Integer> list=new ArrayList<>();

        int maxValue=Integer.MIN_VALUE;
        for (int i:map.values()){
            if (maxValue<i){
                maxValue=i;
            }
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()==maxValue){
                list.add(entry.getKey());
            }
        }

        int[] result=new int[list.size()];
        for (int i = 0; i <list.size(); i++) {
            result[i]=list.get(i);
        }


        return result;

    }







    public static void main(String[] args) {


        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(0);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(2);
        helper(root);
        findMode(root);



    }


}
