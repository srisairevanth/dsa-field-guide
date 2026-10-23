int digitsToNumber(ListNode* head) {
    long long value = 0;
    for (ListNode* node = head; node; node = node->next) value = value * 10 + node->val;
    return (int)value;
}
