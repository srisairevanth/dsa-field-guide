import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : s.toCharArray()) counts.merge(ch, 1, Integer::sum);
        List<Character> ordered = new ArrayList<>(counts.keySet());
        ordered.sort((a, b) -> {
            int byCount = Integer.compare(counts.get(b), counts.get(a));
            return byCount != 0 ? byCount : Character.compare(a, b);
        });
        StringBuilder out = new StringBuilder();
        for (char ch : ordered) out.append(String.valueOf(ch).repeat(counts.get(ch)));
        return out.toString();
    }
}
