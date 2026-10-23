bool canConstruct(const string& note, const string& magazine) {
    int counts[256] = {0};
    for (unsigned char ch : magazine) counts[ch]++;
    for (unsigned char ch : note)
        if (--counts[ch] < 0) return false;
    return true;
}
