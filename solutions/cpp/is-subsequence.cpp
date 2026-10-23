bool isSubsequence(const string& s, const string& t) {
    size_t j = 0;
    for (char ch : s) {
        while (j < t.size() && t[j] != ch) j++;
        if (j == t.size()) return false;
        j++;
    }
    return true;
}
