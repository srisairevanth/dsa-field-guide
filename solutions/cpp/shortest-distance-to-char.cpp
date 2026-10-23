vector<int> shortestToChar(const string& s, const string& c) {
    char target = c.empty() ? '\0' : c[0];
    vector<int> positions;
    for (int i = 0; i < (int)s.size(); i++)
        if (s[i] == target) positions.push_back(i);
    vector<int> out(s.size(), 0);
    for (int i = 0; i < (int)s.size(); i++) {
        int best = INT_MAX;
        for (int p : positions) best = min(best, abs(i - p));
        out[i] = best;
    }
    return out;
}
