bool isIsomorphic(const string& a, const string& b) {
    unordered_map<char, char> forward, backward;
    for (size_t i = 0; i < min(a.size(), b.size()); i++) {
        char x = a[i], y = b[i];
        auto f = forward.find(x);
        if (f != forward.end() && f->second != y) return false;
        auto g = backward.find(y);
        if (g != backward.end() && g->second != x) return false;
        forward[x] = y;
        backward[y] = x;
    }
    return true;
}
