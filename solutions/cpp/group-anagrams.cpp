vector<vector<string>> groupAnagrams(const vector<string>& words) {
    vector<string> keys;
    unordered_map<string, vector<string>> groups;
    for (const string& w : words) {
        string key = w;
        sort(key.begin(), key.end());
        if (!groups.count(key)) keys.push_back(key);
        groups[key].push_back(w);
    }
    vector<vector<string>> out;
    for (const string& k : keys) out.push_back(groups[k]);
    return out;
}
