class Solution {
    public boolean isOneEdit(String a, String b) {
        if (a.length() > b.length()) {
            String t = a;
            a = b;
            b = t;
        }
        if (b.length() - a.length() > 1) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                if (a.length() == b.length()) return a.substring(i + 1).equals(b.substring(i + 1));
                return a.substring(i).equals(b.substring(i + 1));
            }
        }
        return b.length() - a.length() == 1;
    }
}
