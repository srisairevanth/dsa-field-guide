import java.util.*;

class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        Map<Integer, ListNode> seen = new HashMap<>();
        seen.put(0, dummy);
        int prefix = 0;
        for (ListNode node = dummy; node != null; node = node.next) {
            prefix += node.val;
            seen.put(prefix, node);
        }
        prefix = 0;
        ListNode node = dummy;
        while (node != null) {
            prefix += node.val;
            node.next = seen.get(prefix).next;
            node = node.next;
        }
        return dummy.next;
    }
}
