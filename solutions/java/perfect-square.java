class Solution {
    public boolean isPerfectSquare(int num) {
        long lo = 1, hi = num;
        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            if (mid * mid == num) return true;
            if (mid * mid < num) lo = mid + 1;
            else hi = mid - 1;
        }
        return false;
    }
}
