string reverseWords(const string& s) {
    istringstream in(s);
    vector<string> parts;
    string word;
    while (in >> word) parts.push_back(word);
    string out;
    for (size_t i = parts.size(); i-- > 0;) {
        out += parts[i];
        if (i) out += ' ';
    }
    return out;
}
