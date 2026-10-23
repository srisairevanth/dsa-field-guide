class Solution {
    public int singleNumber(int[] items) {
        int result = 0;
        for (int x : items) result ^= x;
        return result;
    }
}
