class Solution {
    public boolean wildMatch(String s, String p) {
        int i = 0, j = 0, star = -1, mark = 0;
        while (i < s.length()) {
            if (j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
                i++;
                j++;
            } else if (j < p.length() && p.charAt(j) == '*') {
                star = j;
                mark = i;
                j++;
            } else if (star != -1) {
                j = star + 1;
                mark++;
                i = mark;
            } else {
                return false;
            }
        }
        while (j < p.length() && p.charAt(j) == '*') j++;
        return j == p.length();
    }
}
