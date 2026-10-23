ListNode* insertSorted(ListNode* head, int value) {
    ListNode dummy(0, head);
    ListNode* prev = &dummy;
    while (prev->next && prev->next->val <= value) prev = prev->next;
    prev->next = new ListNode(value, prev->next);
    return dummy.next;
}
