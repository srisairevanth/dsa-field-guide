int countPalindromes(const string& s) {
    int n = (int)s.size();
    int total = 0;
    for (int center = 0; center < 2 * n - 1; center++) {
        int lo = center / 2, hi = center / 2 + center % 2;
        while (lo >= 0 && hi < n && s[lo] == s[hi]) {
            total++;
            lo--;
            hi++;
        }
    }
    return total;
}
