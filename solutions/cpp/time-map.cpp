class TimeMap {
    unordered_map<string, vector<pair<int, string>>> store;
public:
    void set(const string& key, const string& value, int timestamp) {
        store[key].push_back({timestamp, value});
    }
    string get(const string& key, int timestamp) {
        auto it = store.find(key);
        if (it == store.end()) return "";
        const auto& entries = it->second;
        size_t lo = 0, hi = entries.size();
        while (lo < hi) {
            size_t mid = lo + (hi - lo) / 2;
            if (entries[mid].first <= timestamp) lo = mid + 1;
            else hi = mid;
        }
        return lo > 0 ? entries[lo - 1].second : "";
    }
};
