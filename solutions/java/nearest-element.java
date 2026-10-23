class Solution {
    public int nearestValue(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid;
        }
        int best = 0;
        boolean found = false;
        for (int idx = Math.max(0, lo - 1); idx <= lo && idx < nums.length; idx++) {
            int v = nums[idx];
            int dv = Math.abs(v - target), db = Math.abs(best - target);
            if (!found || dv < db || (dv == db && v < best)) {
                best = v;
                found = true;
            }
        }
        return best;
    }
}
