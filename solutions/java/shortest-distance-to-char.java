class Solution {
    public int[] shortestToChar(String s, String c) {
        char target = c.charAt(0);
        int n = s.length();
        int far = 2 * n + 1;
        int[] out = new int[n];
        int last = -far;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == target) last = i;
            out[i] = i - last;
        }
        last = far;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == target) last = i;
            out[i] = Math.min(out[i], last - i);
        }
        return out;
    }
}
