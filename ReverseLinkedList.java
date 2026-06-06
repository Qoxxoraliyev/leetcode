public class ReverseLinkedList {


    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }


    public static ListNode reverseList(ListNode head){
        ListNode current=head;
        ListNode previous=null;
        ListNode next=null;
        while (current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }

    public static void main(String[] args) {

        ListNode node=new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=new ListNode(3);
        node.next.next.next=new ListNode(4);
        node.next.next.next.next=new ListNode(5);
        reverseList(node);
    }


}
