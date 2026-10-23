class Solution {
    public boolean isAnagram(String a, String b) {
        int[] counts = new int[65536];
        for (char ch : a.toCharArray()) counts[ch]++;
        for (char ch : b.toCharArray()) counts[ch]--;
        for (int c : counts) {
            if (c != 0) return false;
        }
        return true;
    }
}
