string titleCase(const string& s) {
    string out;
    size_t start = 0;
    while (true) {
        size_t pos = s.find(' ', start);
        string word = s.substr(start, pos == string::npos ? string::npos : pos - start);
        if (!word.empty()) {
            word[0] = (char)toupper((unsigned char)word[0]);
            for (size_t k = 1; k < word.size(); k++) word[k] = (char)tolower((unsigned char)word[k]);
        }
        out += word;
        if (pos == string::npos) break;
        out += ' ';
        start = pos + 1;
    }
    return out;
}
