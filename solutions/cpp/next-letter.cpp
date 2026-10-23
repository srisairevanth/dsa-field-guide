string nextLetter(const vector<string>& letters, const string& target) {
    size_t i = upper_bound(letters.begin(), letters.end(), target) - letters.begin();
    return letters[i % letters.size()];
}
