vector<int> spiralOrder(const vector<vector<int>>& m) {
    vector<int> out;
    if (m.empty()) return out;
    int top = 0, bottom = (int)m.size() - 1;
    int left = 0, right = (int)m[0].size() - 1;
    while (top <= bottom && left <= right) {
        for (int c = left; c <= right; c++) out.push_back(m[top][c]);
        top++;
        for (int r = top; r <= bottom; r++) out.push_back(m[r][right]);
        right--;
        if (top <= bottom) {
            for (int c = right; c >= left; c--) out.push_back(m[bottom][c]);
            bottom--;
        }
        if (left <= right && top <= bottom) {
            for (int r = bottom; r >= top; r--) out.push_back(m[r][left]);
            left++;
        }
    }
    return out;
}
