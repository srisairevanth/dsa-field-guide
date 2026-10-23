bool wordBreak(const string& s, const vector<string>& words) {
    unordered_set<string> vocab(words.begin(), words.end());
    vector<bool> ok(s.size() + 1, false);
    ok[0] = true;
    for (size_t end = 1; end <= s.size(); end++)
        for (size_t start = 0; start < end && !ok[end]; start++)
            ok[end] = ok[start] && vocab.count(s.substr(start, end - start)) > 0;
    return ok[s.size()];
}
