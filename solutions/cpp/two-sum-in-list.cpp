bool hasPairWithSum(ListNode* head, int target) {
    unordered_set<long long> seen;
    for (ListNode* node = head; node; node = node->next) {
        if (seen.count((long long)target - node->val)) return true;
        seen.insert(node->val);
    }
    return false;
}
