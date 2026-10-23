import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indeg = new int[numCourses];
        List<List<Integer>> after = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) after.add(new ArrayList<>());
        for (int[] pair : prerequisites) {
            indeg[pair[0]]++;
            after.get(pair[1]).add(pair[0]);
        }
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (indeg[i] == 0) queue.add(i);
        }
        int done = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            done++;
            for (int nxt : after.get(node)) {
                if (--indeg[nxt] == 0) queue.add(nxt);
            }
        }
        return done == numCourses;
    }
}
