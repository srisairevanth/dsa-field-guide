import java.util.*;

class Solution {
    public String decodeString(String s) {
        Deque<String> prevStrings = new ArrayDeque<>();
        Deque<Integer> repeats = new ArrayDeque<>();
        StringBuilder current = new StringBuilder();
        int number = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } else if (ch == '[') {
                prevStrings.push(current.toString());
                repeats.push(number);
                current = new StringBuilder();
                number = 0;
            } else if (ch == ']') {
                String prev = prevStrings.pop();
                int times = repeats.pop();
                String body = current.toString();
                current = new StringBuilder(prev);
                for (int t = 0; t < times; t++) current.append(body);
            } else {
                current.append(ch);
            }
        }
        return current.toString();
    }
}
