class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        long prod = 1;
        int count = 0, lo = 0;
        for (int hi = 0; hi < nums.length; hi++) {
            prod *= nums[hi];
            while (prod >= k) {
                prod = Math.floorDiv(prod, (long) nums[lo]);
                lo++;
            }
            count += hi - lo + 1;
        }
        return count;
    }
}
