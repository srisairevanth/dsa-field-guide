ListNode* deleteAtIndex(ListNode* head, int index) {
    ListNode dummy(0, head);
    ListNode* prev = &dummy;
    for (int i = 0; i < index; i++) {
        if (!prev->next) return dummy.next;
        prev = prev->next;
    }
    if (prev->next) prev->next = prev->next->next;
    return dummy.next;
}
