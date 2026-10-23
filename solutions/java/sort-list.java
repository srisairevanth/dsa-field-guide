import java.util.*;

class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer> values = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) values.add(node.val);
        Collections.sort(values);
        ListNode node = head;
        for (int v : values) {
            node.val = v;
            node = node.next;
        }
        return head;
    }
}
