int lastWordLength(const string& s) {
    istringstream in(s);
    string word, last;
    while (in >> word) last = word;
    return (int)last.size();
}
