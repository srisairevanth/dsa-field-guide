import java.util.*;

class Solution {
    public boolean canMakePalindrome(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : s.toCharArray()) counts.merge(ch, 1, Integer::sum);
        int odd = 0;
        for (int c : counts.values()) {
            if (c % 2 != 0) odd++;
        }
        return odd <= 1;
    }
}
