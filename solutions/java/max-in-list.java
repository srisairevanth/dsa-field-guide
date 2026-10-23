class Solution {
    public int maxInList(ListNode head) {
        int best = head.val;
        for (ListNode node = head.next; node != null; node = node.next) best = Math.max(best, node.val);
        return best;
    }
}
