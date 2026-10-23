bool isOneEdit(const string& a0, const string& b0) {
    string a = a0, b = b0;
    if (a.size() > b.size()) swap(a, b);
    if (b.size() - a.size() > 1) return false;
    for (size_t i = 0; i < a.size(); i++) {
        if (a[i] != b[i]) {
            if (a.size() == b.size()) return a.substr(i + 1) == b.substr(i + 1);
            return a.substr(i) == b.substr(i + 1);
        }
    }
    return b.size() - a.size() == 1;
}
