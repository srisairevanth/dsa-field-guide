class Solution {
    public String caesarShift(String s, int k) {
        StringBuilder out = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') out.append((char) ('a' + Math.floorMod(ch - 'a' + k, 26)));
            else if (ch >= 'A' && ch <= 'Z') out.append((char) ('A' + Math.floorMod(ch - 'A' + k, 26)));
            else out.append(ch);
        }
        return out.toString();
    }
}
