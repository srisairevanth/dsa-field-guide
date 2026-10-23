vector<int> intersect(const vector<int>& a, const vector<int>& b) {
    unordered_set<int> other(b.begin(), b.end());
    unordered_set<int> added;
    vector<int> out;
    for (int x : a)
        if (other.count(x) && !added.count(x)) {
            added.insert(x);
            out.push_back(x);
        }
    return out;
}
