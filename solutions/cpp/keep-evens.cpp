vector<int> keepEvens(ListNode* head) {
    vector<int> out;
    for (ListNode* node = head; node; node = node->next)
        if (node->val % 2 == 0) out.push_back(node->val);
    return out;
}
