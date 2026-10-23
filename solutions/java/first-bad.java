import java.util.function.IntPredicate;

class Solution {
    public int firstBadVersion(int n, IntPredicate isBad) {
        int lo = 1, hi = n;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (isBad.test(mid)) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
}
