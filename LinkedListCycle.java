

public class LinkedListCycle {


    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next=null;
        }
    }


    public static boolean hasCycle(ListNode head){

        ListNode fast=head;
        ListNode slow=head;

        while (slow!=null){

            slow=slow.next;

            if (fast!=null && fast.next==null){
                fast=fast.next.next;
            }
            if (slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        ListNode node=new ListNode(4);
        node.next=new ListNode(1);
        node.next.next=new ListNode(3);
        node.next.next.next=new ListNode(23);
        System.out.println(hasCycle(node));
    }


}
