int longestUnique(const string& text) {
    vector<int> last(256, -1);
    int best = 0, start = 0;
    for (int i = 0; i < (int)text.size(); i++) {
        unsigned char c = text[i];
        if (last[c] >= start) start = last[c] + 1;
        last[c] = i;
        best = max(best, i - start + 1);
    }
    return best;
}
