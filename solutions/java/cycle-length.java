class Solution {
    public int cycleLength(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                int length = 1;
                ListNode node = slow.next;
                while (node != slow) {
                    node = node.next;
                    length++;
                }
                return length;
            }
        }
        return 0;
    }
}
