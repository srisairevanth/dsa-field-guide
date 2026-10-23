vector<int> mergeBetweenZeros(ListNode* head) {
    vector<int> out;
    ListNode* node = head->next;
    int total = 0;
    while (node) {
        if (node->val == 0) {
            out.push_back(total);
            total = 0;
        } else {
            total += node->val;
        }
        node = node->next;
    }
    return out;
}
