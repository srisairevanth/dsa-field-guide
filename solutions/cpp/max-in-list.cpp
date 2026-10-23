int maxInList(ListNode* head) {
    int best = head->val;
    for (ListNode* node = head->next; node; node = node->next) best = max(best, node->val);
    return best;
}
