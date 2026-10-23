ListNode* removeEveryKth(ListNode* head, int k) {
    ListNode dummy(0, head);
    ListNode* cur = &dummy;
    int count = 0;
    while (cur->next) {
        count++;
        if (count % k == 0) cur->next = cur->next->next;
        else cur = cur->next;
    }
    return dummy.next;
}
