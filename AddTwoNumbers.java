public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null)
            return null;
        ListNode head;

        int flag = 0;

        int sum = l1.val + l2.val;
        if(sum < 10)
            head = new ListNode(sum);
        else
        {
            head = new ListNode(sum - 10);
            flag = 1;
        }
        l1 = l1.next;
        l2 = l2.next;
        ListNode current = head;

        while(l1 != null || l2 != null)
        {
            int val1, val2;
            if(l1 == null)
                val1 = 0;
            else
                val1 = l1.val;
            if(l2 == null)
                val2 = 0;
            else
                val2 = l2.val;

            sum = val1 + val2;
            if(sum + flag < 10)
            {
                current.next = new ListNode(sum + flag);
                flag = 0;
            }
            else
            {
                current.next = new ListNode(sum + flag - 10);
                flag = 1;
            }

            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
            current = current.next;
        }

        if(flag == 1)
        {
            current.next = new ListNode(1);
        }

        return head;

    }
}
