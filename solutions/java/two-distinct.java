import java.util.*;

class Solution {
    public int lengthOfTwoDistinct(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        int best = 0, lo = 0;
        for (int hi = 0; hi < s.length(); hi++) {
            counts.merge(s.charAt(hi), 1, Integer::sum);
            while (counts.size() > 2) {
                char left = s.charAt(lo);
                if (counts.merge(left, -1, Integer::sum) == 0) counts.remove(left);
                lo++;
            }
            best = Math.max(best, hi - lo + 1);
        }
        return best;
    }
}
