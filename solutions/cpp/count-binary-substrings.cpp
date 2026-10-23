int countBinarySubstrings(const string& s) {
    vector<int> runs;
    size_t i = 0;
    while (i < s.size()) {
        size_t j = i;
        while (j < s.size() && s[j] == s[i]) j++;
        runs.push_back((int)(j - i));
        i = j;
    }
    int total = 0;
    for (size_t k = 0; k + 1 < runs.size(); k++) total += min(runs[k], runs[k + 1]);
    return total;
}
