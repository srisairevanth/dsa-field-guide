bool isPalindrome(const string& s) {
    string kept;
    for (char ch : s)
        if (isalnum((unsigned char)ch)) kept += (char)tolower((unsigned char)ch);
    return equal(kept.begin(), kept.end(), kept.rbegin());
}
