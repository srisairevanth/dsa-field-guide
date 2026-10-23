class Solution {
    public int lcsLength(String a, String b) {
        int[] prev = new int[b.length() + 1];
        for (int i = 0; i < a.length(); i++) {
            int[] cur = new int[b.length() + 1];
            for (int j = 0; j < b.length(); j++) {
                cur[j + 1] = a.charAt(i) == b.charAt(j) ? prev[j] + 1 : Math.max(prev[j + 1], cur[j]);
            }
            prev = cur;
        }
        return prev[b.length()];
    }
}
