class Solution {
    public ListNode deleteFirstValue(ListNode head, int value) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        while (prev.next != null) {
            if (prev.next.val == value) {
                prev.next = prev.next.next;
                break;
            }
            prev = prev.next;
        }
        return dummy.next;
    }
}
