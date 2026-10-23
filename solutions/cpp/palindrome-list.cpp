bool isPalindromeList(ListNode* head) {
    vector<int> vals;
    for (ListNode* node = head; node; node = node->next) vals.push_back(node->val);
    return equal(vals.begin(), vals.end(), vals.rbegin());
}
