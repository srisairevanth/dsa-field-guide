vector<int> findAnagrams(const string& s, const string& p) {
    int need[256] = {0}, window[256] = {0};
    for (unsigned char c : p) need[c]++;
    int m = (int)p.size();
    vector<int> out;
    for (int i = 0; i < (int)s.size(); i++) {
        window[(unsigned char)s[i]]++;
        if (i >= m) window[(unsigned char)s[i - m]]--;
        if (equal(window, window + 256, need)) out.push_back(i - m + 1);
    }
    return out;
}
