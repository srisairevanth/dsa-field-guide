int countVowels(const string& s) {
    int count = 0;
    for (char ch : s) {
        char c = (char)tolower((unsigned char)ch);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') count++;
    }
    return count;
}
