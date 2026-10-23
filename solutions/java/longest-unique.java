import java.util.*;

class Solution {
    public int longestUnique(String text) {
        int[] last = new int[65536];
        Arrays.fill(last, -1);
        int best = 0, start = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (last[c] >= start) start = last[c] + 1;
            last[c] = i;
            best = Math.max(best, i - start + 1);
        }
        return best;
    }
}
