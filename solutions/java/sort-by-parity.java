class Solution {
    public int[] sortByParity(int[] nums) {
        int[] out = new int[nums.length];
        int k = 0;
        for (int x : nums) {
            if (x % 2 == 0) out[k++] = x;
        }
        for (int x : nums) {
            if (x % 2 != 0) out[k++] = x;
        }
        return out;
    }
}
