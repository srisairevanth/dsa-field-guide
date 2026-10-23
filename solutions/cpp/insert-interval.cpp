vector<vector<int>> insertInterval(const vector<vector<int>>& intervals, const vector<int>& newInterval) {
    vector<vector<int>> out;
    int start = newInterval[0], end = newInterval[1];
    bool placed = false;
    for (const auto& iv : intervals) {
        int a = iv[0], b = iv[1];
        if (b < start) {
            out.push_back({a, b});
        } else if (end < a) {
            if (!placed) {
                out.push_back({start, end});
                placed = true;
            }
            out.push_back({a, b});
        } else {
            start = min(start, a);
            end = max(end, b);
        }
    }
    if (!placed) out.push_back({start, end});
    return out;
}
