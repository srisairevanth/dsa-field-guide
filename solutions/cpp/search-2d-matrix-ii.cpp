bool searchMatrixSorted(const vector<vector<int>>& matrix, int target) {
    if (matrix.empty() || matrix[0].empty()) return false;
    int rows = (int)matrix.size();
    int r = 0, c = (int)matrix[0].size() - 1;
    while (r < rows && c >= 0) {
        int v = matrix[r][c];
        if (v == target) return true;
        if (v > target) c--;
        else r++;
    }
    return false;
}
