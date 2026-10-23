class Solution {
    public int[][] setZeroes(int[][] m) {
        int rows = m.length;
        int cols = rows > 0 ? m[0].length : 0;
        boolean[] zeroRow = new boolean[rows];
        boolean[] zeroCol = new boolean[cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (m[r][c] == 0) {
                    zeroRow[r] = true;
                    zeroCol[c] = true;
                }
            }
        }
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (zeroRow[r] || zeroCol[c]) m[r][c] = 0;
            }
        }
        return m;
    }
}
