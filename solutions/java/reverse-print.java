import java.util.*;

class Solution {
    public int[] reversePrint(ListNode head) {
        List<Integer> values = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) values.add(node.val);
        int n = values.size();
        int[] out = new int[n];
        for (int i = 0; i < n; i++) out[i] = values.get(n - 1 - i);
        return out;
    }
}
