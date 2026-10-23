int lcsLength(const string& a, const string& b) {
    vector<int> prev(b.size() + 1, 0);
    for (char x : a) {
        vector<int> cur(1, 0);
        for (size_t j = 0; j < b.size(); j++)
            cur.push_back(x == b[j] ? prev[j] + 1 : max(prev[j + 1], cur[j]));
        prev = cur;
    }
    return prev.back();
}
