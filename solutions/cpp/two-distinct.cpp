int lengthOfTwoDistinct(const string& s) {
    int counts[256] = {0};
    int distinct = 0, best = 0, lo = 0;
    for (int hi = 0; hi < (int)s.size(); hi++) {
        unsigned char c = s[hi];
        if (counts[c]++ == 0) distinct++;
        while (distinct > 2) {
            unsigned char left = s[lo];
            if (--counts[left] == 0) distinct--;
            lo++;
        }
        best = max(best, hi - lo + 1);
    }
    return best;
}
