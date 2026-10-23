class Solution {
    public int[] twoSumIndices(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            long s = (long) nums[i] + nums[j];
            if (s == target) return new int[] { i, j };
            if (s < target) i++;
            else j--;
        }
        return new int[0];
    }
}
