int countSegments(const string& s) {
    istringstream in(s);
    string word;
    int count = 0;
    while (in >> word) count++;
    return count;
}
