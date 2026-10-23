class Solution {
    public long climbStairs(int n) {
        long a = 1, b = 1;
        for (int i = 1; i < n; i++) {
            long next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}
