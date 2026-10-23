string multiplyStrings(const string& a, const string& b) {
    auto parse = [](const string& text, bool& negative) {
        size_t start = 0;
        negative = false;
        if (start < text.size() && (text[start] == '-' || text[start] == '+')) {
            negative = text[start] == '-';
            start++;
        }
        return text.substr(start);
    };
    bool negA = false, negB = false;
    string x = parse(a, negA), y = parse(b, negB);
    vector<int> digits(x.size() + y.size(), 0);
    for (int i = (int)x.size() - 1; i >= 0; i--)
        for (int j = (int)y.size() - 1; j >= 0; j--) {
            int sum = (x[i] - '0') * (y[j] - '0') + digits[i + j + 1];
            digits[i + j + 1] = sum % 10;
            digits[i + j] += sum / 10;
        }
    string out;
    for (int d : digits)
        if (!(out.empty() && d == 0)) out += (char)('0' + d);
    if (out.empty()) return "0";
    return (negA != negB ? "-" : "") + out;
}
