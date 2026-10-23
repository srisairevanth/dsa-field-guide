class Solution {
    public int maxCircularSubarray(int[] nums) {
        long total = 0;
        for (int x : nums) total += x;
        long bestMax = nums[0], curMax = nums[0], bestMin = nums[0], curMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            long x = nums[i];
            curMax = Math.max(x, curMax + x);
            bestMax = Math.max(bestMax, curMax);
            curMin = Math.min(x, curMin + x);
            bestMin = Math.min(bestMin, curMin);
        }
        if (bestMax < 0) return (int) bestMax;
        return (int) Math.max(bestMax, total - bestMin);
    }
}
