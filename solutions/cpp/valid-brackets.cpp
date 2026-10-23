bool isValid(const string& s) {
    unordered_map<char, char> partner = {{')', '('}, {']', '['}, {'}', '{'}};
    string stack;
    for (char ch : s) {
        auto it = partner.find(ch);
        if (it != partner.end()) {
            if (stack.empty() || stack.back() != it->second) return false;
            stack.pop_back();
        } else {
            stack.push_back(ch);
        }
    }
    return stack.empty();
}
