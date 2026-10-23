class Solution {
    public int lastWordLength(String s) {
        String[] words = s.trim().split("\\s+");
        return words[words.length - 1].length();
    }
}
