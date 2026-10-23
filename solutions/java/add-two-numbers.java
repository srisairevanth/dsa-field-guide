class Solution {
    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        int carry = 0;
        while (a != null || b != null || carry != 0) {
            int total = carry;
            if (a != null) {
                total += a.val;
                a = a.next;
            }
            if (b != null) {
                total += b.val;
                b = b.next;
            }
            tail.next = new ListNode(total % 10);
            tail = tail.next;
            carry = total / 10;
        }
        return dummy.next;
    }
}
