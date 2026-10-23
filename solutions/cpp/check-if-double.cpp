bool checkIfDouble(const vector<int>& arr) {
    unordered_set<long long> seen;
    for (int x : arr) {
        if (seen.count(2LL * x) || (x % 2 == 0 && seen.count(x / 2))) return true;
        seen.insert(x);
    }
    return false;
}
