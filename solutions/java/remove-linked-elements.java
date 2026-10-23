class Solution {
    public ListNode removeElements(ListNode head, int value) {
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.val == value) cur.next = cur.next.next;
            else cur = cur.next;
        }
        return dummy.next;
    }
}
