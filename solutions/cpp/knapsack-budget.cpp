int bestValue(const vector<vector<int>>& items, int budget) {
    vector<int> best(budget + 1, 0);
    for (const auto& item : items) {
        int w = item[0], v = item[1];
        for (int b = budget; b >= w; b--)
            best[b] = max(best[b], best[b - w] + v);
    }
    return best[budget];
}
