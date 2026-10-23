import java.util.*;

class Solution {
    public boolean isPalindromeList(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        for (ListNode node = head; node != null; node = node.next) vals.add(node.val);
        int i = 0, j = vals.size() - 1;
        while (i < j) {
            if (!vals.get(i).equals(vals.get(j))) return false;
            i++;
            j--;
        }
        return true;
    }
}
