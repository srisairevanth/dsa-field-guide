import java.util.*;

class Solution {
    public int friendsWithin(Map<String, List<String>> graph, String start, int k) {
        Set<String> seen = new HashSet<>();
        seen.add(start);
        List<String> ring = new ArrayList<>();
        ring.add(start);
        for (int step = 0; step < k; step++) {
            List<String> next = new ArrayList<>();
            for (String person : ring) {
                for (String friend : graph.getOrDefault(person, List.of())) {
                    if (seen.add(friend)) next.add(friend);
                }
            }
            ring = next;
        }
        return seen.size() - 1;
    }
}
