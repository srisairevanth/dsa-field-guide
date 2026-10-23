import java.util.*;

class Solution {
    public boolean wordBreak(String s, String[] words) {
        Set<String> vocab = new HashSet<>(Arrays.asList(words));
        boolean[] ok = new boolean[s.length() + 1];
        ok[0] = true;
        for (int end = 1; end <= s.length(); end++) {
            for (int start = 0; start < end && !ok[end]; start++) {
                ok[end] = ok[start] && vocab.contains(s.substring(start, end));
            }
        }
        return ok[s.length()];
    }
}
