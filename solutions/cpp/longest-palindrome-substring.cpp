string longestPalindrome(const string& s) {
    string best;
    int n = (int)s.size();
    auto expand = [&](int lo, int hi) {
        while (lo >= 0 && hi < n && s[lo] == s[hi]) {
            lo--;
            hi++;
        }
        return s.substr(lo + 1, hi - lo - 1);
    };
    for (int i = 0; i < n; i++) {
        string a = expand(i, i), b = expand(i, i + 1);
        if (a.size() > best.size()) best = a;
        if (b.size() > best.size()) best = b;
    }
    return best;
}
