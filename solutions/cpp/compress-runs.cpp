string compressRuns(const string& s) {
    string out;
    size_t i = 0;
    while (i < s.size()) {
        size_t j = i;
        while (j < s.size() && s[j] == s[i]) j++;
        out += s[i] + to_string(j - i);
        i = j;
    }
    return out;
}
