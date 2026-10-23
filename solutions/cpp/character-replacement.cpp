int characterReplacement(const string& s, int k) {
    int counts[256] = {0};
    int best = 0, lo = 0, top = 0;
    for (int hi = 0; hi < (int)s.size(); hi++) {
        unsigned char c = s[hi];
        counts[c]++;
        top = max(top, counts[c]);
        while ((hi - lo + 1) - top > k) {
            counts[(unsigned char)s[lo]]--;
            lo++;
        }
        best = max(best, hi - lo + 1);
    }
    return best;
}
