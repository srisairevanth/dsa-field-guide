string caesarShift(const string& s, int k) {
    string out;
    for (char ch : s) {
        if (ch >= 'a' && ch <= 'z') out += (char)('a' + (((ch - 'a' + k) % 26) + 26) % 26);
        else if (ch >= 'A' && ch <= 'Z') out += (char)('A' + (((ch - 'A' + k) % 26) + 26) % 26);
        else out += ch;
    }
    return out;
}
