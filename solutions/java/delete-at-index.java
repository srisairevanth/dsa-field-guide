class Solution {
    public ListNode deleteAtIndex(ListNode head, int index) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        for (int i = 0; i < index; i++) {
            if (prev.next == null) return dummy.next;
            prev = prev.next;
        }
        if (prev.next != null) prev.next = prev.next.next;
        return dummy.next;
    }
}
