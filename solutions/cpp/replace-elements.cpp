vector<int> replaceElements(const vector<int>& arr) {
    vector<int> out(arr.size(), -1);
    int best = -1;
    for (int i = (int)arr.size() - 1; i >= 0; i--) {
        out[i] = best;
        best = max(best, arr[i]);
    }
    return out;
}
