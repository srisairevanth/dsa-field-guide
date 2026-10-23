vector<vector<int>> transpose(const vector<vector<int>>& m) {
    if (m.empty()) return {};
    size_t cols = m[0].size();
    vector<vector<int>> out(cols);
    for (const auto& row : m)
        for (size_t c = 0; c < cols && c < row.size(); c++) out[c].push_back(row[c]);
    return out;
}
