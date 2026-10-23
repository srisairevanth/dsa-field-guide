import java.util.*;

class Solution {
    public boolean isIsomorphic(String a, String b) {
        Map<Character, Character> forward = new HashMap<>();
        Map<Character, Character> backward = new HashMap<>();
        int n = Math.min(a.length(), b.length());
        for (int i = 0; i < n; i++) {
            char x = a.charAt(i), y = b.charAt(i);
            if (forward.getOrDefault(x, y) != y || backward.getOrDefault(y, x) != x) return false;
            forward.put(x, y);
            backward.put(y, x);
        }
        return true;
    }
}
