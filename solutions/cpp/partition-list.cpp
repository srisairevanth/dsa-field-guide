ListNode* partitionList(ListNode* head, int x) {
    ListNode beforeDummy, afterDummy;
    ListNode* before = &beforeDummy;
    ListNode* after = &afterDummy;
    while (head) {
        if (head->val < x) {
            before->next = head;
            before = head;
        } else {
            after->next = head;
            after = head;
        }
        head = head->next;
    }
    after->next = nullptr;
    before->next = afterDummy.next;
    return beforeDummy.next;
}
