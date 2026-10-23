string minWindow(const string& s, const string& t) {
    int need[256] = {0};
    for (unsigned char c : t) need[c]++;
    int missing = (int)t.size();
    int bestLo = 0, bestHi = -1, lo = 0;
    for (int hi = 0; hi < (int)s.size(); hi++) {
        unsigned char ch = s[hi];
        if (need[ch] > 0) missing--;
        need[ch]--;
        while (missing == 0) {
            if (bestHi < 0 || hi - lo < bestHi - bestLo) {
                bestLo = lo;
                bestHi = hi;
            }
            unsigned char left = s[lo];
            need[left]++;
            if (need[left] > 0) missing++;
            lo++;
        }
    }
    return bestHi < 0 ? "" : s.substr(bestLo, bestHi - bestLo + 1);
}
