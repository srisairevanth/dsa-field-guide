class Solution {
    public boolean validPalindromeTwo(String s) {
        int lo = 0, hi = s.length() - 1;
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) return isPal(s, lo + 1, hi) || isPal(s, lo, hi - 1);
            lo++;
            hi--;
        }
        return true;
    }

    private boolean isPal(String s, int lo, int hi) {
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) return false;
            lo++;
            hi--;
        }
        return true;
    }
}
