import java.util.*;

class Solution {
    public int[] keepEvens(ListNode head) {
        List<Integer> out = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) {
            if (node.val % 2 == 0) out.add(node.val);
        }
        return out.stream().mapToInt(Integer::intValue).toArray();
    }
}
