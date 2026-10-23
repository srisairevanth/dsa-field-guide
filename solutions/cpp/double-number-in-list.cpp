vector<int> doubleNumber(ListNode* head) {
    vector<int> digits;
    for (ListNode* node = head; node; node = node->next) digits.push_back(node->val);
    int carry = 0;
    vector<int> out;
    for (int i = (int)digits.size() - 1; i >= 0; i--) {
        int total = digits[i] * 2 + carry;
        out.push_back(total % 10);
        carry = total / 10;
    }
    if (carry) out.push_back(carry);
    reverse(out.begin(), out.end());
    return out;
}
