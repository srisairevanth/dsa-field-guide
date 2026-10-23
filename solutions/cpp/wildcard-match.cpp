bool wildMatch(const string& s, const string& p) {
    int i = 0, j = 0, star = -1, mark = 0;
    int n = (int)s.size(), m = (int)p.size();
    while (i < n) {
        if (j < m && (p[j] == '?' || p[j] == s[i])) {
            i++;
            j++;
        } else if (j < m && p[j] == '*') {
            star = j;
            mark = i;
            j++;
        } else if (star != -1) {
            j = star + 1;
            mark++;
            i = mark;
        } else {
            return false;
        }
    }
    while (j < m && p[j] == '*') j++;
    return j == m;
}
