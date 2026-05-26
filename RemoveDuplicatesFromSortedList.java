
public class RemoveDuplicatesFromSortedList {

    public static class ListNode{
        int data;
        ListNode next;
        ListNode(){}

        public ListNode(int data) {
            this.data = data;
        }

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }

    public static ListNode deleteDuplications(ListNode head){
        ListNode current=head;
        while (current!=null && current.next!=null){
            if (current.data==current.next.data){
                current.next=current.next.next;
            }
            else {
                current=current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(23);
        ListNode node3=new ListNode(23);
        ListNode node4=new ListNode(55);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        ListNode current=node1;
        ListNode result=deleteDuplications(node1);
        ListNode temp=result;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}
