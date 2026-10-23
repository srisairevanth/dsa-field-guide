string decodeString(const string& s) {
    vector<pair<string, int>> stack;
    string current;
    int number = 0;
    for (char ch : s) {
        if (isdigit((unsigned char)ch)) {
            number = number * 10 + (ch - '0');
        } else if (ch == '[') {
            stack.push_back({current, number});
            current.clear();
            number = 0;
        } else if (ch == ']') {
            auto [prev, times] = stack.back();
            stack.pop_back();
            string repeated;
            for (int i = 0; i < times; i++) repeated += current;
            current = prev + repeated;
        } else {
            current += ch;
        }
    }
    return current;
}
