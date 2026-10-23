import java.util.*;

class Solution {
    public int[] findAnagrams(String s, String p) {
        Map<Character, Integer> need = new HashMap<>();
        for (char ch : p.toCharArray()) need.merge(ch, 1, Integer::sum);
        Map<Character, Integer> window = new HashMap<>();
        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            window.merge(s.charAt(i), 1, Integer::sum);
            if (i >= p.length()) {
                char left = s.charAt(i - p.length());
                if (window.merge(left, -1, Integer::sum) == 0) window.remove(left);
            }
            if (window.equals(need)) out.add(i - p.length() + 1);
        }
        return out.stream().mapToInt(Integer::intValue).toArray();
    }
}
