class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int remaining = length(head);
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        while (remaining >= k) {
            ListNode first = prev.next;
            ListNode cur = first;
            ListNode lastPrev = null;
            for (int i = 0; i < k; i++) {
                ListNode nxt = cur.next;
                cur.next = lastPrev;
                lastPrev = cur;
                cur = nxt;
            }
            prev.next = lastPrev;
            first.next = cur;
            prev = first;
            remaining -= k;
        }
        return dummy.next;
    }

    private int length(ListNode node) {
        int n = 0;
        for (; node != null; node = node.next) n++;
        return n;
    }
}
