
class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Natija listni qulay qurish uchun dummy node
        ListNode dummy = new ListNode(-1); // head
        ListNode current = dummy; // node

        // list1=1,2,4
        // list2=1,3,4

        // Ikkala list ham bo'sh bo'lmaguncha ishlaymiz
        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;   // list1 dagi tugunni ulaymiz
                list1 = list1.next;     // list1 ni oldinga suramiz
            } else {
                current.next = list2;   // list2 dagi tugunni ulaymiz
                list2 = list2.next;     // list2 ni oldinga suramiz
            }
            current = current.next;     // current ham oldinga o'tadi
        }

        // Qaysi listda element qolgan bo'lsa, shuni to'liq ulaymiz
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Dummy node'dan keyingi qism haqiqiy javob bo'ladi
        return dummy.next;
    }

    public static void main(String[] args) {

        // list1 : 1->2->4
        ListNode list1=new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next=new ListNode(4);

        // list2: 1->3->4
        ListNode list2=new ListNode(1);
        list2.next=new ListNode(3);
        list2.next.next=new ListNode(4);

        Solution solution=new Solution();

        ListNode result=solution.mergeTwoLists(list1,list2);
        while (result!=null){
            System.out.println(result.val+"-> ");
            result=result.next;
        }

    }
}
