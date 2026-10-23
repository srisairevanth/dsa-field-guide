int firstUniqueChar(const string& s) {
    int counts[256] = {0};
    for (unsigned char ch : s) counts[ch]++;
    for (size_t i = 0; i < s.size(); i++)
        if (counts[(unsigned char)s[i]] == 1) return (int)i;
    return -1;
}
