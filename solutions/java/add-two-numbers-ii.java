import java.util.*;

class Solution {
    public int[] addNumbersForward(ListNode a, ListNode b) {
        List<Integer> x = toList(a), y = toList(b);
        int i = x.size() - 1, j = y.size() - 1, carry = 0;
        List<Integer> out = new ArrayList<>();
        while (i >= 0 || j >= 0 || carry != 0) {
            int total = carry;
            if (i >= 0) total += x.get(i--);
            if (j >= 0) total += y.get(j--);
            out.add(total % 10);
            carry = total / 10;
        }
        int[] result = new int[out.size()];
        for (int k = 0; k < result.length; k++) result[k] = out.get(out.size() - 1 - k);
        return result;
    }

    private List<Integer> toList(ListNode node) {
        List<Integer> out = new ArrayList<>();
        for (; node != null; node = node.next) out.add(node.val);
        return out;
    }
}
