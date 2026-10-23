class Solution {
    public int[] spiralOrder(int[][] m) {
        int rows = m.length;
        int cols = rows > 0 ? m[0].length : 0;
        int[] out = new int[rows * cols];
        int k = 0;
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        while (top <= bottom && left <= right) {
            for (int c = left; c <= right; c++) out[k++] = m[top][c];
            top++;
            for (int r = top; r <= bottom; r++) out[k++] = m[r][right];
            right--;
            if (top <= bottom) {
                for (int c = right; c >= left; c--) out[k++] = m[bottom][c];
                bottom--;
            }
            if (left <= right && top <= bottom) {
                for (int r = bottom; r >= top; r--) out[k++] = m[r][left];
                left++;
            }
        }
        return out;
    }
}
