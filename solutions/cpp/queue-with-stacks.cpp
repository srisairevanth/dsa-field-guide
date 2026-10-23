class MyQueue {
    vector<int> inbox, outbox;
    void shiftInbox() {
        if (outbox.empty())
            while (!inbox.empty()) {
                outbox.push_back(inbox.back());
                inbox.pop_back();
            }
    }
public:
    void push(int x) { inbox.push_back(x); }
    int peek() {
        shiftInbox();
        return outbox.back();
    }
    int pop() {
        shiftInbox();
        int v = outbox.back();
        outbox.pop_back();
        return v;
    }
    bool empty() { return inbox.empty() && outbox.empty(); }
};
