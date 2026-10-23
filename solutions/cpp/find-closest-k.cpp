vector<int> findClosestElements(const vector<int>& arr, int k, double x) {
    vector<int> ranked = arr;
    sort(ranked.begin(), ranked.end(), [&](int a, int b) {
        double da = fabs(a - x), db = fabs(b - x);
        if (da != db) return da < db;
        return a < b;
    });
    ranked.resize(min((size_t)k, ranked.size()));
    sort(ranked.begin(), ranked.end());
    return ranked;
}
