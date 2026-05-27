public class IntersectionOfTwoLinkedLists {


    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

    }


    public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
        ListNode current1=headA;
        ListNode current2=headB;
        while (current1!=current2){

            if (current1==null){
                current1=headB;
            }
            else {
                current1=current1.next;
            }
           if (current2==null){
               current2=headA;
           }
           else {
               current2=current2.next;
           }
        }
        return current1;
    }

    public static void main(String[] args) {

        ListNode node1=new ListNode(4);
        node1.next=new ListNode(1);
        node1.next.next=new ListNode(8);
        node1.next.next.next=new ListNode(4);
        node1.next.next.next.next=new ListNode(5);
        ListNode node2=new ListNode(5);
        node2.next=new ListNode(6);
        node2.next.next=new ListNode(1);
        node2.next.next.next=node1.next.next;
        node2.next.next.next.next=new ListNode(4);
        node2.next.next.next.next.next=new ListNode(5);
        System.out.println(getIntersectionNode(node1,node2).val);
    }


}
