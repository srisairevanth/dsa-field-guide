ListNode* deleteAllDuplicates(ListNode* head) {
    ListNode dummy(0, head);
    ListNode* prev = &dummy;
    ListNode* cur = head;
    while (cur) {
        if (cur->next && cur->val == cur->next->val) {
            int v = cur->val;
            while (cur && cur->val == v) cur = cur->next;
            prev->next = cur;
        } else {
            prev = cur;
            cur = cur->next;
        }
    }
    return dummy.next;
}
