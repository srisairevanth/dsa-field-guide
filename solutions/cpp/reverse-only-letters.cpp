string reverseOnlyLetters(const string& s) {
    string chars = s;
    int i = 0, j = (int)chars.size() - 1;
    while (i < j) {
        if (!isalpha((unsigned char)chars[i])) i++;
        else if (!isalpha((unsigned char)chars[j])) j--;
        else {
            swap(chars[i], chars[j]);
            i++;
            j--;
        }
    }
    return chars;
}
