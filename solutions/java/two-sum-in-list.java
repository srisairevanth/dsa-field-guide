import java.util.*;

class Solution {
    public boolean hasPairWithSum(ListNode head, int target) {
        Set<Integer> seen = new HashSet<>();
        for (ListNode node = head; node != null; node = node.next) {
            if (seen.contains(target - node.val)) return true;
            seen.add(node.val);
        }
        return false;
    }
}
