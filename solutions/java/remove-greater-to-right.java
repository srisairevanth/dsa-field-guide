import java.util.*;

class Solution {
    public ListNode removeGreaterToRight(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) nodes.add(node);
        List<ListNode> keep = new ArrayList<>();
        int best = Integer.MIN_VALUE;
        for (int i = nodes.size() - 1; i >= 0; i--) {
            ListNode n = nodes.get(i);
            if (n.val >= best) {
                keep.add(n);
                best = n.val;
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int i = keep.size() - 1; i >= 0; i--) {
            tail.next = keep.get(i);
            tail = keep.get(i);
        }
        tail.next = null;
        return dummy.next;
    }
}
