string commonPrefix(const vector<string>& words) {
    if (words.empty()) return "";
    string prefix = words[0];
    for (size_t i = 1; i < words.size(); i++)
        while (words[i].compare(0, prefix.size(), prefix) != 0) prefix.pop_back();
    return prefix;
}
