ListNode* keepFirstOccurrence(ListNode* head) {
    unordered_set<int> seen;
    ListNode dummy(0, head);
    ListNode* prev = &dummy;
    ListNode* cur = head;
    while (cur) {
        if (seen.count(cur->val)) {
            prev->next = cur->next;
        } else {
            seen.insert(cur->val);
            prev = cur;
        }
        cur = cur->next;
    }
    return dummy.next;
}
