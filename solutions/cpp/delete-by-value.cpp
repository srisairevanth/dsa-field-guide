ListNode* deleteFirstValue(ListNode* head, int value) {
    ListNode dummy(0, head);
    ListNode* prev = &dummy;
    while (prev->next) {
        if (prev->next->val == value) {
            prev->next = prev->next->next;
            break;
        }
        prev = prev->next;
    }
    return dummy.next;
}
