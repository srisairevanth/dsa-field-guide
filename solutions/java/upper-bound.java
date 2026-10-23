class Solution {
    public int upperBound(int[] nums, int t) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (nums[mid] <= t) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
