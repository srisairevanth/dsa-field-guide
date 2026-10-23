int countGroups(const unordered_map<string, vector<string>>& graph) {
    unordered_set<string> seen;
    int groups = 0;
    for (const auto& entry : graph) {
        const string& start = entry.first;
        if (seen.count(start)) continue;
        groups++;
        seen.insert(start);
        vector<string> stack = {start};
        while (!stack.empty()) {
            string person = stack.back();
            stack.pop_back();
            auto it = graph.find(person);
            if (it == graph.end()) continue;
            for (const string& friend_ : it->second) {
                if (!seen.count(friend_)) {
                    seen.insert(friend_);
                    stack.push_back(friend_);
                }
            }
        }
    }
    return groups;
}
