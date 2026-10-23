int maxTwinSum(ListNode* head) {
    vector<int> values;
    for (ListNode* node = head; node; node = node->next) values.push_back(node->val);
    int n = (int)values.size();
    long long best = LLONG_MIN;
    for (int i = 0; i < n / 2; i++) best = max(best, (long long)values[i] + values[n - 1 - i]);
    return (int)best;
}
