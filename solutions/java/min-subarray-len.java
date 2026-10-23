class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int best = Integer.MAX_VALUE;
        long total = 0;
        int lo = 0;
        for (int hi = 0; hi < nums.length; hi++) {
            total += nums[hi];
            while (total >= target) {
                best = Math.min(best, hi - lo + 1);
                total -= nums[lo];
                lo++;
            }
        }
        return best == Integer.MAX_VALUE ? 0 : best;
    }
}
