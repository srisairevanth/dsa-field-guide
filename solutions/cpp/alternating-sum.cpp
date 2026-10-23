int alternatingSum(ListNode* head) {
    long long total = 0;
    int sign = 1;
    for (ListNode* node = head; node; node = node->next) {
        total += sign * node->val;
        sign = -sign;
    }
    return (int)total;
}
