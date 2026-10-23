bool repeatedSubstring(const string& s) {
    if (s.empty()) return false;
    string t = s + s;
    return t.substr(1, t.size() - 2).find(s) != string::npos;
}
