import java.util.*;

class Solution {
    public int longestRun(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int x : nums) seen.add(x);
        int best = 0;
        for (int x : seen) {
            if (seen.contains(x - 1)) continue;
            int length = 1;
            while (seen.contains(x + length)) length++;
            best = Math.max(best, length);
        }
        return best;
    }
}
