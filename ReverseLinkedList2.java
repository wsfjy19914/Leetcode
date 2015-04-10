/**
 * Created by fjy on 15/04/10.
 */
public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m == n)
            return head;
        int i = 0;
        ListNode origin = new ListNode(0);
        origin.next = head;
        head = origin;
        ListNode prev;

        while(i < m - 1)
        {
            head = head.next;
            i ++;
        }

        prev = head;
        head = head.next;
        i ++;

        while(i < n)
        {
            ListNode tmp = head.next;
            head.next = tmp.next;
            tmp.next = prev.next;
            prev.next = tmp;
            i ++;
        }

        return origin.next;
    }
}
