string countAndSay(int n) {
    string term = "1";
    for (int step = 1; step < n; step++) {
        string out;
        size_t i = 0;
        while (i < term.size()) {
            size_t j = i;
            while (j < term.size() && term[j] == term[i]) j++;
            out += to_string(j - i);
            out += term[i];
            i = j;
        }
        term = out;
    }
    return term;
}
