vector<vector<int>> setZeroes(vector<vector<int>> m) {
    if (m.empty()) return m;
    int rows = (int)m.size(), cols = (int)m[0].size();
    vector<bool> zeroRow(rows, false), zeroCol(cols, false);
    for (int r = 0; r < rows; r++)
        for (int c = 0; c < cols; c++)
            if (m[r][c] == 0) {
                zeroRow[r] = true;
                zeroCol[c] = true;
            }
    for (int r = 0; r < rows; r++)
        for (int c = 0; c < cols; c++)
            if (zeroRow[r] || zeroCol[c]) m[r][c] = 0;
    return m;
}
