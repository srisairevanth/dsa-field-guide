import java.util.*;

class Solution {
    public String minRemoveValid(String s) {
        char[] chars = s.toCharArray();
        boolean[] drop = new boolean[chars.length];
        Deque<Integer> open = new ArrayDeque<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                open.push(i);
            } else if (chars[i] == ')') {
                if (!open.isEmpty()) open.pop();
                else drop[i] = true;
            }
        }
        for (int i : open) drop[i] = true;
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (!drop[i]) out.append(chars[i]);
        }
        return out.toString();
    }
}
