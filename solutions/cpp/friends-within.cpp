int friendsWithin(const unordered_map<string, vector<string>>& graph, const string& start, int k) {
    unordered_set<string> seen = {start};
    vector<string> ring = {start};
    for (int step = 0; step < k; step++) {
        vector<string> next;
        for (const string& person : ring) {
            auto it = graph.find(person);
            if (it == graph.end()) continue;
            for (const string& friend_ : it->second) {
                if (!seen.count(friend_)) {
                    seen.insert(friend_);
                    next.push_back(friend_);
                }
            }
        }
        ring = next;
    }
    return (int)seen.size() - 1;
}
