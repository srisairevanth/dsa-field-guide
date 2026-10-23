optional<int> cycleStartValue(ListNode* head) {
    ListNode* slow = head;
    ListNode* fast = head;
    bool met = false;
    while (fast && fast->next) {
        slow = slow->next;
        fast = fast->next->next;
        if (slow == fast) {
            met = true;
            break;
        }
    }
    if (!met) return nullopt;
    ListNode* p = head;
    while (p != fast) {
        p = p->next;
        fast = fast->next;
    }
    return p->val;
}
