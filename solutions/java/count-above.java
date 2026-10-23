class Solution {
    public int countAbove(ListNode head, int threshold) {
        int count = 0;
        for (ListNode node = head; node != null; node = node.next) {
            if (node.val > threshold) count++;
        }
        return count;
    }
}
