class Solution {
    public int[][] transpose(int[][] m) {
        if (m.length == 0) return new int[0][0];
        int rows = m.length, cols = m[0].length;
        int[][] out = new int[cols][rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) out[c][r] = m[r][c];
        }
        return out;
    }
}
