ListNode* rotateRight(ListNode* head, int k) {
    if (!head) return nullptr;
    int length = 1;
    ListNode* tail = head;
    while (tail->next) {
        tail = tail->next;
        length++;
    }
    k = ((k % length) + length) % length;
    if (k == 0) return head;
    ListNode* cut = head;
    for (int i = 0; i < length - k - 1; i++) cut = cut->next;
    ListNode* newHead = cut->next;
    cut->next = nullptr;
    tail->next = head;
    return newHead;
}
