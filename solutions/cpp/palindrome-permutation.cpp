bool canMakePalindrome(const string& s) {
    int counts[256] = {0};
    for (unsigned char c : s) counts[c]++;
    int odd = 0;
    for (int c : counts) odd += c % 2;
    return odd <= 1;
}
