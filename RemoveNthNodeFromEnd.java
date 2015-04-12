public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null)
            return head;
        if(head.next == null && n == 1)
            return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int num = 1;
        ListNode current = head;
        while(current.next != null)
        {
            current = current.next;
            num ++;
        }

        current = dummy;

        for(int i = 0; i < num - n; i++)
            current = current.next;

        current.next = current.next.next;

        return dummy.next;

    }
}
