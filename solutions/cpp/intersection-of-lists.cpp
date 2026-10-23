ListNode* getIntersectionNode(ListNode* headA, ListNode* headB) {
    ListNode* pa = headA;
    ListNode* pb = headB;
    while (pa != pb) {
        pa = pa ? pa->next : headB;
        pb = pb ? pb->next : headA;
    }
    return pa;
}
