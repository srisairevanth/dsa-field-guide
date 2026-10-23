string zigzag(const string& s, int rows) {
    if (rows <= 1 || rows >= (int)s.size()) return s;
    vector<string> lines(rows);
    int row = 0, step = 1;
    for (char ch : s) {
        lines[row] += ch;
        if (row == 0) step = 1;
        else if (row == rows - 1) step = -1;
        row += step;
    }
    string out;
    for (const string& line : lines) out += line;
    return out;
}
