vector<int> reversePrint(ListNode* head) {
    vector<int> values;
    for (ListNode* node = head; node; node = node->next) values.push_back(node->val);
    reverse(values.begin(), values.end());
    return values;
}
