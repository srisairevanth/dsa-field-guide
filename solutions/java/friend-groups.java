import java.util.*;

class Solution {
    public int countGroups(Map<String, List<String>> graph) {
        Set<String> seen = new HashSet<>();
        int groups = 0;
        for (String start : graph.keySet()) {
            if (seen.contains(start)) continue;
            groups++;
            seen.add(start);
            Deque<String> stack = new ArrayDeque<>();
            stack.push(start);
            while (!stack.isEmpty()) {
                String person = stack.pop();
                for (String friend : graph.getOrDefault(person, List.of())) {
                    if (seen.add(friend)) stack.push(friend);
                }
            }
        }
        return groups;
    }
}
