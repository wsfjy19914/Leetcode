public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;

        if(head.next == head)
            return head;

        ListNode pointer1 = head;
        ListNode pointer2 = head;
        int flag = 0;
        while(pointer1 != null && pointer1.next != null)
        {
            pointer1 = pointer1.next.next;
            pointer2 = pointer2.next;
            if(pointer1 == pointer2)
            {
                flag = 1;
                break;
            }

        }
        if(flag == 1)
        {
            pointer2 = head;
            while(pointer2 != pointer1)
            {
                pointer1 = pointer1.next;
                pointer2 = pointer2.next;
            }
            return pointer1;
        }

        return null;
    }
}
