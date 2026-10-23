class Solution {
    public int countOccurrences(int[] nums, int t) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (nums[mid] < t) lo = mid + 1;
            else hi = mid;
        }
        int first = lo;
        lo = first;
        hi = nums.length;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (nums[mid] <= t) lo = mid + 1;
            else hi = mid;
        }
        return lo - first;
    }
}
