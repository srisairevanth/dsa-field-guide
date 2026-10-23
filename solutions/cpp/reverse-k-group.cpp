ListNode* reverseKGroup(ListNode* head, int k) {
    auto length = [](ListNode* node) {
        int n = 0;
        while (node) {
            n++;
            node = node->next;
        }
        return n;
    };
    ListNode dummy(0, head);
    ListNode* prev = &dummy;
    int remaining = length(head);
    while (remaining >= k) {
        ListNode* first = prev->next;
        ListNode* cur = first;
        ListNode* lastPrev = nullptr;
        for (int i = 0; i < k; i++) {
            ListNode* nxt = cur->next;
            cur->next = lastPrev;
            lastPrev = cur;
            cur = nxt;
        }
        prev->next = lastPrev;
        first->next = cur;
        prev = first;
        remaining -= k;
    }
    return dummy.next;
}
