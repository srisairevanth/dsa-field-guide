class Solution {
    public int firstUniqueChar(String s) {
        int[] counts = new int[65536];
        for (char ch : s.toCharArray()) counts[ch]++;
        for (int i = 0; i < s.length(); i++) {
            if (counts[s.charAt(i)] == 1) return i;
        }
        return -1;
    }
}
