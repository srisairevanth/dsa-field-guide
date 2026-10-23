import java.util.*;

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int[] hs = heaters.clone();
        Arrays.sort(hs);
        int best = 0;
        for (int h : houses) {
            int lo = 0, hi = hs.length;
            while (lo < hi) {
                int mid = (lo + hi) >>> 1;
                if (hs[mid] < h) lo = mid + 1;
                else hi = mid;
            }
            int dist = Integer.MAX_VALUE;
            if (lo < hs.length) dist = hs[lo] - h;
            if (lo > 0) dist = Math.min(dist, h - hs[lo - 1]);
            best = Math.max(best, dist);
        }
        return best;
    }
}
