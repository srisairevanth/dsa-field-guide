class Solution {
    public long minimumTime(int[] times, int totalTrips) {
        long minTime = Integer.MAX_VALUE;
        for (int t : times) minTime = Math.min(minTime, t);
        long lo = 1, hi = minTime * totalTrips;
        while (lo < hi) {
            long mid = (lo + hi) / 2;
            long trips = 0;
            for (int t : times) trips += mid / t;
            if (trips >= totalTrips) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
}
