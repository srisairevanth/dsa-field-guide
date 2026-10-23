string minRemoveValid(const string& s) {
    vector<bool> removed(s.size(), false);
    vector<int> open;
    for (int i = 0; i < (int)s.size(); i++) {
        if (s[i] == '(') open.push_back(i);
        else if (s[i] == ')') {
            if (!open.empty()) open.pop_back();
            else removed[i] = true;
        }
    }
    for (int i : open) removed[i] = true;
    string out;
    for (size_t i = 0; i < s.size(); i++)
        if (!removed[i]) out += s[i];
    return out;
}
