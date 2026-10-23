int kthSmallest(const vector<vector<int>>& matrix, int k) {
    using Entry = tuple<int, int, int>;
    priority_queue<Entry, vector<Entry>, greater<Entry>> heap;
    for (int r = 0; r < (int)matrix.size(); r++) heap.push(Entry(matrix[r][0], r, 0));
    int value = 0;
    for (int i = 0; i < k; i++) {
        auto [v, r, c] = heap.top();
        heap.pop();
        value = v;
        if (c + 1 < (int)matrix[r].size()) heap.push(Entry(matrix[r][c + 1], r, c + 1));
    }
    return value;
}
