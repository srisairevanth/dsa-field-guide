class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[65536];
        for (char ch : t.toCharArray()) need[ch]++;
        int missing = t.length();
        int bestLo = 0, bestHi = -1;
        int lo = 0;
        for (int hi = 0; hi < s.length(); hi++) {
            char ch = s.charAt(hi);
            if (need[ch] > 0) missing--;
            need[ch]--;
            while (missing == 0) {
                if (bestHi < 0 || hi - lo < bestHi - bestLo) {
                    bestLo = lo;
                    bestHi = hi;
                }
                char left = s.charAt(lo);
                need[left]++;
                if (need[left] > 0) missing++;
                lo++;
            }
        }
        return bestHi < 0 ? "" : s.substring(bestLo, bestHi + 1);
    }
}
