class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int i = 0, j = chars.length - 1;
        while (i < j) {
            if (vowels.indexOf(chars[i]) < 0) {
                i++;
            } else if (vowels.indexOf(chars[j]) < 0) {
                j--;
            } else {
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                i++;
                j--;
            }
        }
        return new String(chars);
    }
}
