class Solution {
    public boolean repeatedSubstring(String s) {
        if (s.isEmpty()) return false;
        return (s + s).substring(1, 2 * s.length() - 1).contains(s);
    }
}
