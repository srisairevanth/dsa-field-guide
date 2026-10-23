vector<int> pairSums(ListNode* head) {
    vector<int> values;
    for (ListNode* node = head; node; node = node->next) values.push_back(node->val);
    vector<int> out;
    for (size_t i = 0; i + 1 < values.size(); i++) out.push_back(values[i] + values[i + 1]);
    return out;
}
