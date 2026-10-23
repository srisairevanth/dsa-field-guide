class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = lowerBound(nums, target);
        if (first == nums.length || nums[first] != target) return new int[] { -1, -1 };
        return new int[] { first, lowerBound(nums, target + 1) - 1 };
    }

    private int lowerBound(int[] nums, int t) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (nums[mid] < t) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
