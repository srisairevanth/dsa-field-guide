vector<int> successfulPairs(const vector<int>& spells, const vector<int>& potions, int success) {
    vector<int> ordered = potions;
    sort(ordered.begin(), ordered.end());
    vector<int> out;
    for (int s : spells) {
        long long a = success, b = s;
        long long need = a >= 0 ? (a + b - 1) / b : -((-a) / b);
        auto it = lower_bound(ordered.begin(), ordered.end(), need);
        out.push_back((int)(ordered.end() - it));
    }
    return out;
}
