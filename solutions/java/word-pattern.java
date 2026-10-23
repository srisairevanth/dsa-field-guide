import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String trimmed = s.trim();
        String[] words = trimmed.isEmpty() ? new String[0] : trimmed.split("\\s+");
        if (words.length != pattern.length()) return false;
        Map<Character, String> forward = new HashMap<>();
        Map<String, Character> backward = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String w = words[i];
            if (forward.containsKey(ch) && !forward.get(ch).equals(w)) return false;
            if (backward.containsKey(w) && backward.get(w) != ch) return false;
            forward.put(ch, w);
            backward.put(w, ch);
        }
        return true;
    }
}
