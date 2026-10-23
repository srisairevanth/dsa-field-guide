class Solution {
    public int alternatingSum(ListNode head) {
        int total = 0, sign = 1;
        for (ListNode node = head; node != null; node = node.next) {
            total += sign * node.val;
            sign = -sign;
        }
        return total;
    }
}
