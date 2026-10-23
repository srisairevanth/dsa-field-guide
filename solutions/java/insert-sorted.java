class Solution {
    public ListNode insertSorted(ListNode head, int value) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        while (prev.next != null && prev.next.val <= value) prev = prev.next;
        prev.next = new ListNode(value, prev.next);
        return dummy.next;
    }
}
