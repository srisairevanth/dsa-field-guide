import java.util.*;

class Solution {
    public int maxMinDistance(int[] positions, int m) {
        int[] sorted = positions.clone();
        Arrays.sort(sorted);
        int lo = 1, hi = sorted[sorted.length - 1] - sorted[0];
        while (lo < hi) {
            int mid = lo + (hi - lo + 1) / 2;
            int count = 1, last = sorted[0];
            for (int i = 1; i < sorted.length; i++) {
                if (sorted[i] - last >= mid) {
                    count++;
                    last = sorted[i];
                }
            }
            if (count >= m) lo = mid;
            else hi = mid - 1;
        }
        return lo;
    }
}
