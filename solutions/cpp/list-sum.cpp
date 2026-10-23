int listSum(ListNode* head) {
    long long total = 0;
    for (ListNode* node = head; node; node = node->next) total += node->val;
    return (int)total;
}
