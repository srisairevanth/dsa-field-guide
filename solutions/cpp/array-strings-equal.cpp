bool arrayStringsEqual(const vector<string>& a, const vector<string>& b) {
    string x, y;
    for (const string& w : a) x += w;
    for (const string& w : b) y += w;
    return x == y;
}
