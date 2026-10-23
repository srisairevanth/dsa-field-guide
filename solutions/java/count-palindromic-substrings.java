class Solution {
    public int countPalindromes(String s) {
        int total = 0;
        for (int center = 0; center < 2 * s.length() - 1; center++) {
            int lo = center / 2, hi = center / 2 + center % 2;
            while (lo >= 0 && hi < s.length() && s.charAt(lo) == s.charAt(hi)) {
                total++;
                lo--;
                hi++;
            }
        }
        return total;
    }
}
