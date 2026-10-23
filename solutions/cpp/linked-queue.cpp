class LinkedQueue {
    deque<int> items;
public:
    void push(int value) { items.push_back(value); }
    int peek() { return items.empty() ? -1 : items.front(); }
    int pop() {
        if (items.empty()) return -1;
        int v = items.front();
        items.pop_front();
        return v;
    }
    bool empty() { return items.empty(); }
};
