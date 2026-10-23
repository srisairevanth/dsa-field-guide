vector<string> casePermutations(const string& s) {
    vector<string> out = {""};
    for (char ch : s) {
        vector<string> next;
        if (isalpha((unsigned char)ch)) {
            char lower = (char)tolower((unsigned char)ch), upper = (char)toupper((unsigned char)ch);
            for (const string& p : out) {
                next.push_back(p + lower);
                next.push_back(p + upper);
            }
        } else {
            for (const string& p : out) next.push_back(p + ch);
        }
        out = next;
    }
    return out;
}
