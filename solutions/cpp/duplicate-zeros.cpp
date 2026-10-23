vector<int> duplicateZeros(const vector<int>& arr) {
    vector<int> out;
    for (int x : arr) {
        out.push_back(x);
        if (x == 0) out.push_back(0);
    }
    out.resize(arr.size());
    return out;
}
