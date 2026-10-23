class LRUCache {
    int capacity;
    list<pair<int, int>> items;
    unordered_map<int, list<pair<int, int>>::iterator> index;
public:
    LRUCache(int capacity) : capacity(capacity) {}
    int get(int key) {
        auto it = index.find(key);
        if (it == index.end()) return -1;
        items.splice(items.begin(), items, it->second);
        return it->second->second;
    }
    void put(int key, int value) {
        auto it = index.find(key);
        if (it != index.end()) {
            it->second->second = value;
            items.splice(items.begin(), items, it->second);
            return;
        }
        items.push_front({key, value});
        index[key] = items.begin();
        if ((int)items.size() > capacity) {
            index.erase(items.back().first);
            items.pop_back();
        }
    }
};
