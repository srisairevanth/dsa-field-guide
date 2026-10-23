class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        int shift = ((k % length) + length) % length;
        if (shift == 0) return head;
        ListNode cut = head;
        for (int i = 0; i < length - shift - 1; i++) cut = cut.next;
        ListNode newHead = cut.next;
        cut.next = null;
        tail.next = head;
        return newHead;
    }
}
