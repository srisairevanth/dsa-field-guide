string reverseVowels(const string& s) {
    string chars = s;
    auto isVowel = [](char c) { return string("aeiouAEIOU").find(c) != string::npos; };
    int i = 0, j = (int)chars.size() - 1;
    while (i < j) {
        if (!isVowel(chars[i])) i++;
        else if (!isVowel(chars[j])) j--;
        else {
            swap(chars[i], chars[j]);
            i++;
            j--;
        }
    }
    return chars;
}
