ListNode* removeZeroSumSublists(ListNode* head) {
    ListNode dummy(0, head);
    long long prefix = 0;
    unordered_map<long long, ListNode*> seen;
    ListNode* node = &dummy;
    while (node) {
        prefix += node->val;
        seen[prefix] = node;
        node = node->next;
    }
    prefix = 0;
    node = &dummy;
    while (node) {
        prefix += node->val;
        node->next = seen[prefix]->next;
        node = node->next;
    }
    return dummy.next;
}
