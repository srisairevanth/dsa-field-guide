import java.util.*;

class Solution {
    public int longestPalindromeLength(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : s.toCharArray()) counts.merge(ch, 1, Integer::sum);
        int total = 0;
        boolean odd = false;
        for (int c : counts.values()) {
            total += c / 2 * 2;
            if (c % 2 != 0) odd = true;
        }
        return total + (odd ? 1 : 0);
    }
}
