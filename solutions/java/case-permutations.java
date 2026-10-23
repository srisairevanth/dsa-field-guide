import java.util.*;

class Solution {
    public List<String> casePermutations(String s) {
        List<String> out = new ArrayList<>();
        out.add("");
        for (char ch : s.toCharArray()) {
            List<String> next = new ArrayList<>();
            for (String p : out) {
                if (Character.isLetter(ch)) {
                    next.add(p + Character.toLowerCase(ch));
                    next.add(p + Character.toUpperCase(ch));
                } else {
                    next.add(p + ch);
                }
            }
            out = next;
        }
        return out;
    }
}
