import java.util.*;

class Solution {
    public int maxTwinSum(ListNode head) {
        List<Integer> values = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) values.add(node.val);
        int n = values.size();
        int best = Integer.MIN_VALUE;
        for (int i = 0; i < n / 2; i++) best = Math.max(best, values.get(i) + values.get(n - 1 - i));
        return best;
    }
}
