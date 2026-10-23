vector<int> addNumbersForward(ListNode* a, ListNode* b) {
    auto toList = [](ListNode* node) {
        vector<int> out;
        for (; node; node = node->next) out.push_back(node->val);
        return out;
    };
    vector<int> x = toList(a), y = toList(b);
    int i = (int)x.size() - 1, j = (int)y.size() - 1, carry = 0;
    vector<int> out;
    while (i >= 0 || j >= 0 || carry) {
        int total = carry;
        if (i >= 0) total += x[i--];
        if (j >= 0) total += y[j--];
        out.push_back(total % 10);
        carry = total / 10;
    }
    reverse(out.begin(), out.end());
    return out;
}
