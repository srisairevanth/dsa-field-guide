class Solution {
    public ListNode mergeBetweenZeros(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        int total = 0;
        for (ListNode node = head.next; node != null; node = node.next) {
            if (node.val == 0) {
                tail.next = new ListNode(total);
                tail = tail.next;
                total = 0;
            } else {
                total += node.val;
            }
        }
        return dummy.next;
    }
}
