int longestPalindromeLength(const string& s) {
    int counts[256] = {0};
    for (unsigned char c : s) counts[c]++;
    int total = 0;
    bool odd = false;
    for (int c : counts) {
        total += c / 2 * 2;
        if (c % 2) odd = true;
    }
    return total + (odd ? 1 : 0);
}
