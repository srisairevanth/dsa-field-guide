class Solution {
    public int floorValue(int[] nums, int limit) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (nums[mid] <= limit) lo = mid + 1;
            else hi = mid;
        }
        return lo > 0 ? nums[lo - 1] : -1;
    }
}
