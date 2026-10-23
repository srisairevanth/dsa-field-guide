vector<vector<int>> rotateMatrix(const vector<vector<int>>& m) {
    if (m.empty()) return {};
    size_t n = m.size(), cols = m[0].size();
    vector<vector<int>> out(cols, vector<int>(n, 0));
    for (size_t c = 0; c < cols; c++)
        for (size_t k = 0; k < n; k++) out[c][k] = m[n - 1 - k][c];
    return out;
}
