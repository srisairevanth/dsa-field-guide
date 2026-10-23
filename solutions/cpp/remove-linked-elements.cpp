ListNode* removeElements(ListNode* head, int value) {
    ListNode dummy(0, head);
    ListNode* cur = &dummy;
    while (cur->next) {
        if (cur->next->val == value) cur->next = cur->next->next;
        else cur = cur->next;
    }
    return dummy.next;
}
