class Solution {
    public int listSum(ListNode head) {
        int total = 0;
        for (ListNode node = head; node != null; node = node.next) total += node.val;
        return total;
    }
}
