string frequencySort(const string& s) {
    int counts[256] = {0};
    for (unsigned char c : s) counts[c]++;
    vector<int> chars;
    for (int c = 0; c < 256; c++)
        if (counts[c]) chars.push_back(c);
    sort(chars.begin(), chars.end(), [&](int a, int b) {
        if (counts[a] != counts[b]) return counts[a] > counts[b];
        return a < b;
    });
    string out;
    for (int c : chars) out += string(counts[c], (char)c);
    return out;
}
