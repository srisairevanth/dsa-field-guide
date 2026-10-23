vector<int> nextGreaterNodes(ListNode* head) {
    vector<int> values;
    for (ListNode* node = head; node; node = node->next) values.push_back(node->val);
    vector<int> out(values.size(), 0);
    vector<int> stack;
    for (int i = 0; i < (int)values.size(); i++) {
        while (!stack.empty() && values[stack.back()] < values[i]) {
            out[stack.back()] = values[i];
            stack.pop_back();
        }
        stack.push_back(i);
    }
    return out;
}
