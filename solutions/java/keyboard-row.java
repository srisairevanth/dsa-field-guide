import java.util.*;

class Solution {
    public String[] keyboardRow(String[] words) {
        String[] rows = { "qwertyuiop", "asdfghjkl", "zxcvbnm" };
        List<String> out = new ArrayList<>();
        for (String w : words) {
            String lower = w.toLowerCase(Locale.ROOT);
            boolean fits = false;
            for (String row : rows) {
                boolean all = true;
                for (char ch : lower.toCharArray()) {
                    if (row.indexOf(ch) < 0) {
                        all = false;
                        break;
                    }
                }
                if (all) {
                    fits = true;
                    break;
                }
            }
            if (fits) out.add(w);
        }
        return out.toArray(new String[0]);
    }
}
