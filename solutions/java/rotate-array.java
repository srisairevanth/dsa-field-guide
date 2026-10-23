class Solution {
    public int[] rotateRight(int[] nums, int k) {
        int n = nums.length;
        int[] out = new int[n];
        if (n == 0) return out;
        int shift = ((k % n) + n) % n;
        for (int i = 0; i < n; i++) out[(i + shift) % n] = nums[i];
        return out;
    }
}
