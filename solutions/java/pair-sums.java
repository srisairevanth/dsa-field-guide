import java.util.*;

class Solution {
    public int[] pairSums(ListNode head) {
        List<Integer> values = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) values.add(node.val);
        int n = values.size();
        int[] out = new int[Math.max(0, n - 1)];
        for (int i = 0; i + 1 < n; i++) out[i] = values.get(i) + values.get(i + 1);
        return out;
    }
}
