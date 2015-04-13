public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;

        if(head.next == head)
            return true;

        ListNode pointer1 = head.next;
        ListNode pointer2 = head;

        while(pointer1 != null && pointer1.next != null)
        {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
            if(pointer1 == pointer2)
                return true;
            pointer1 = pointer1.next;

        }
        return false;
    }
}
