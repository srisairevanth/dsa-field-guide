class Solution {
    public int rowWithMostOnes(int[][] mat) {
        int bestRow = 0, best = -1;
        for (int r = 0; r < mat.length; r++) {
            int ones = 0;
            for (int x : mat[r]) ones += x;
            if (ones > best) {
                bestRow = r;
                best = ones;
            }
        }
        return bestRow;
    }
}
