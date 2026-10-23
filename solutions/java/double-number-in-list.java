import java.util.*;

class Solution {
    public int[] doubleNumber(ListNode head) {
        List<Integer> digits = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) digits.add(node.val);
        List<Integer> out = new ArrayList<>();
        int carry = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
            int total = digits.get(i) * 2 + carry;
            out.add(total % 10);
            carry = total / 10;
        }
        if (carry != 0) out.add(carry);
        int[] result = new int[out.size()];
        for (int k = 0; k < result.length; k++) result[k] = out.get(out.size() - 1 - k);
        return result;
    }
}
