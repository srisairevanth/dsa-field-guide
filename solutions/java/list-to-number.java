class Solution {
    public long digitsToNumber(ListNode head) {
        long value = 0;
        for (ListNode node = head; node != null; node = node.next) value = value * 10 + node.val;
        return value;
    }
}
