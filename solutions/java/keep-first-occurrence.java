import java.util.*;

class Solution {
    public ListNode keepFirstOccurrence(ListNode head) {
        Set<Integer> seen = new HashSet<>();
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (seen.contains(cur.val)) {
                prev.next = cur.next;
            } else {
                seen.add(cur.val);
                prev = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
