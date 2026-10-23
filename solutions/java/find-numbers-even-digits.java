class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int x : nums) {
            if (String.valueOf(Math.abs(x)).length() % 2 == 0) count++;
        }
        return count;
    }
}
