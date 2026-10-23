class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] out = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int y : nums) {
                if (y < nums[i]) out[i]++;
            }
        }
        return out;
    }
}
