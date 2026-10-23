class Solution {
    public boolean searchMatrixSorted(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int r = 0, c = matrix[0].length - 1;
        while (r < matrix.length && c >= 0) {
            int v = matrix[r][c];
            if (v == target) return true;
            if (v > target) c--;
            else r++;
        }
        return false;
    }
}
