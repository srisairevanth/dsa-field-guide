vector<string> keyboardRow(const vector<string>& words) {
    const string rows[] = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
    vector<string> out;
    for (const string& w : words) {
        string lower = w;
        for (char& ch : lower) ch = (char)tolower((unsigned char)ch);
        bool inRow = false;
        for (const string& row : rows) {
            bool all = true;
            for (char ch : lower)
                if (row.find(ch) == string::npos) {
                    all = false;
                    break;
                }
            if (all) {
                inRow = true;
                break;
            }
        }
        if (inRow) out.push_back(w);
    }
    return out;
}
