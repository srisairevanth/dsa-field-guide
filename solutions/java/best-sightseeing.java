class Solution {
    public int maxScoreSightseeing(int[] values) {
        int best = Integer.MIN_VALUE;
        int bestLeft = values[0];
        for (int j = 1; j < values.length; j++) {
            best = Math.max(best, bestLeft + values[j] - j);
            bestLeft = Math.max(bestLeft, values[j] + j);
        }
        return best;
    }
}
