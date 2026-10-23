class Solution {
    public Integer cycleStartValue(ListNode head) {
        ListNode slow = head, fast = head;
        boolean looped = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                looped = true;
                break;
            }
        }
        if (!looped) return null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    }
}
