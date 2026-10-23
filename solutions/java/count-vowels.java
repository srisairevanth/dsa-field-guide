class Solution {
    public int countVowels(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if ("aeiou".indexOf(Character.toLowerCase(ch)) >= 0) count++;
        }
        return count;
    }
}
