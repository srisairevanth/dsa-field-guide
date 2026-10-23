import java.util.*;

class Solution {
    public int[] nextGreaterNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) values.add(node.val);
        int n = values.size();
        int[] out = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            int v = values.get(i);
            while (!stack.isEmpty() && values.get(stack.peek()) < v) {
                out[stack.pop()] = v;
            }
            stack.push(i);
        }
        return out;
    }
}
