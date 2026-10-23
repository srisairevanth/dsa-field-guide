class Solution {
    public String longestPalindrome(String s) {
        String best = "";
        for (int i = 0; i < s.length(); i++) {
            for (String cand : new String[] { expand(s, i, i), expand(s, i, i + 1) }) {
                if (cand.length() > best.length()) best = cand;
            }
        }
        return best;
    }

    private String expand(String s, int lo, int hi) {
        while (lo >= 0 && hi < s.length() && s.charAt(lo) == s.charAt(hi)) {
            lo--;
            hi++;
        }
        return s.substring(lo + 1, hi);
    }
}
