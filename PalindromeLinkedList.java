import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {


    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

    }

    public static boolean isPalindrome(ListNode head){

        List<Integer> list=new ArrayList<>();
        ListNode current=head;

        while (current!=null){
            list.add(current.val);
            current=current.next;
        }

        int left=0;
        int right=list.size()-1;

        while (left<=right){

            if (list.get(left)!=list.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        ListNode node=new ListNode(5);
        node.next=new ListNode(5);
        node.next.next=new ListNode(5);
        node.next.next.next=new ListNode(5);
        System.out.println(isPalindrome(node));

    }
}
