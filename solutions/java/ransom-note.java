class Solution {
    public boolean canConstruct(String note, String magazine) {
        int[] available = new int[65536];
        for (char ch : magazine.toCharArray()) available[ch]++;
        for (char ch : note.toCharArray()) {
            if (--available[ch] < 0) return false;
        }
        return true;
    }
}
