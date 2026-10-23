ListNode* removeGreaterToRight(ListNode* head) {
    vector<ListNode*> nodes;
    for (ListNode* node = head; node; node = node->next) nodes.push_back(node);
    vector<ListNode*> keep;
    long long best = LLONG_MIN;
    for (size_t i = nodes.size(); i-- > 0;) {
        if (nodes[i]->val >= best) {
            keep.push_back(nodes[i]);
            best = nodes[i]->val;
        }
    }
    ListNode dummy;
    ListNode* tail = &dummy;
    for (size_t i = keep.size(); i-- > 0;) {
        tail->next = keep[i];
        tail = keep[i];
    }
    tail->next = nullptr;
    return dummy.next;
}
