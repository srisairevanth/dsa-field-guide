import java.util.*;

class Solution {
    public String titleCase(String s) {
        String[] words = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i > 0) sb.append(' ');
            String w = words[i];
            if (!w.isEmpty()) {
                sb.append(w.substring(0, 1).toUpperCase(Locale.ROOT));
                sb.append(w.substring(1).toLowerCase(Locale.ROOT));
            }
        }
        return sb.toString();
    }
}
