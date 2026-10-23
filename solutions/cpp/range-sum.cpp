vector<long long> rangeSums(const vector<int>& sales, const vector<vector<int>>& queries) {
    vector<long long> prefix(1, 0);
    for (int x : sales) prefix.push_back(prefix.back() + x);
    vector<long long> out;
    for (const auto& q : queries) out.push_back(prefix[q[1] + 1] - prefix[q[0]]);
    return out;
}
