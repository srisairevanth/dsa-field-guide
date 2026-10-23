int editDistance(const string& a, const string& b) {
    vector<int> prev(b.size() + 1);
    for (size_t j = 0; j <= b.size(); j++) prev[j] = (int)j;
    for (size_t i = 1; i <= a.size(); i++) {
        vector<int> cur(1, (int)i);
        for (size_t j = 1; j <= b.size(); j++) {
            int cost = a[i - 1] != b[j - 1] ? 1 : 0;
            cur.push_back(min({prev[j] + 1, cur[j - 1] + 1, prev[j - 1] + cost}));
        }
        prev = cur;
    }
    return prev.back();
}
