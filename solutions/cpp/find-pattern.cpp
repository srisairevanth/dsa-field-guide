int findPattern(const string& text, const string& pattern) {
    size_t pos = text.find(pattern);
    return pos == string::npos ? -1 : (int)pos;
}
