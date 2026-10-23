bool validPalindromeTwo(const string& s) {
    auto ok = [&](int lo, int hi) {
        while (lo < hi) {
            if (s[lo] != s[hi]) return false;
            lo++;
            hi--;
        }
        return true;
    };
    int lo = 0, hi = (int)s.size() - 1;
    while (lo < hi) {
        if (s[lo] != s[hi]) return ok(lo + 1, hi) || ok(lo, hi - 1);
        lo++;
        hi--;
    }
    return true;
}
