ListNode* sortList(ListNode* head) {
    vector<int> values;
    for (ListNode* node = head; node; node = node->next) values.push_back(node->val);
    sort(values.begin(), values.end());
    ListNode* node = head;
    for (int v : values) {
        node->val = v;
        node = node->next;
    }
    return head;
}
