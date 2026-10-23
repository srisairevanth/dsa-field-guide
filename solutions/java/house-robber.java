class Solution {
    public int rob(int[] houses) {
        int take = 0, skip = 0;
        for (int h : houses) {
            int nextTake = skip + h;
            skip = Math.max(skip, take);
            take = nextTake;
        }
        return Math.max(take, skip);
    }
}
