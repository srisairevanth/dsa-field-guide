class Solution {
    public ListNode removeEveryKth(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        int count = 0;
        while (cur.next != null) {
            count++;
            if (count % k == 0) cur.next = cur.next.next;
            else cur = cur.next;
        }
        return dummy.next;
    }
}
