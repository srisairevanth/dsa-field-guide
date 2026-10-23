bool wordPattern(const string& pattern, const string& s) {
    istringstream in(s);
    vector<string> words;
    string w;
    while (in >> w) words.push_back(w);
    if (words.size() != pattern.size()) return false;
    unordered_map<char, string> forward;
    unordered_map<string, char> backward;
    for (size_t i = 0; i < pattern.size(); i++) {
        char ch = pattern[i];
        const string& word = words[i];
        auto f = forward.find(ch);
        if (f != forward.end() && f->second != word) return false;
        auto b = backward.find(word);
        if (b != backward.end() && b->second != ch) return false;
        forward[ch] = word;
        backward[word] = ch;
    }
    return true;
}
