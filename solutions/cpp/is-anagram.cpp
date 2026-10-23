bool isAnagram(const string& a, const string& b) {
    string x = a, y = b;
    sort(x.begin(), x.end());
    sort(y.begin(), y.end());
    return x == y;
}
