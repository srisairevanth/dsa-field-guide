class Solution {
    public int[] moveZeroes(int[] nums) {
        int[] out = new int[nums.length];
        int k = 0;
        for (int x : nums) {
            if (x != 0) out[k++] = x;
        }
        return out;
    }
}
