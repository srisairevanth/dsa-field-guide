class Solution {
    public int characterReplacement(String s, int k) {
        int[] counts = new int[65536];
        int best = 0, lo = 0, top = 0;
        for (int hi = 0; hi < s.length(); hi++) {
            char ch = s.charAt(hi);
            counts[ch]++;
            top = Math.max(top, counts[ch]);
            while ((hi - lo + 1) - top > k) {
                counts[s.charAt(lo)]--;
                lo++;
            }
            best = Math.max(best, hi - lo + 1);
        }
        return best;
    }
}
