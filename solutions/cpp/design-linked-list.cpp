class MyLinkedList {
    vector<int> items;
public:
    int get(int index) {
        if (index >= 0 && index < (int)items.size()) return items[index];
        return -1;
    }
    void addAtHead(int val) { items.insert(items.begin(), val); }
    void addAtTail(int val) { items.push_back(val); }
    void addAtIndex(int index, int val) {
        if (index >= 0 && index <= (int)items.size()) items.insert(items.begin() + index, val);
    }
    void deleteAtIndex(int index) {
        if (index >= 0 && index < (int)items.size()) items.erase(items.begin() + index);
    }
};
