class Solution {
    public int[][] rotateMatrix(int[][] m) {
        int rows = m.length;
        if (rows == 0) return new int[0][0];
        int cols = m[0].length;
        int[][] out = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) out[i][j] = m[rows - 1 - j][i];
        }
        return out;
    }
}
