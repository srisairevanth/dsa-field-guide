import java.util.*;

class Solution {
    public int[][] mergeIntervals(int[][] intervals) {
        int[][] ordered = Arrays.stream(intervals).map(int[]::clone).toArray(int[][]::new);
        Arrays.sort(ordered, (x, y) -> Integer.compare(x[0], y[0]));
        List<int[]> out = new ArrayList<>();
        for (int[] iv : ordered) {
            if (!out.isEmpty() && iv[0] <= out.get(out.size() - 1)[1]) {
                int[] last = out.get(out.size() - 1);
                last[1] = Math.max(last[1], iv[1]);
            } else {
                out.add(new int[] { iv[0], iv[1] });
            }
        }
        return out.toArray(new int[0][]);
    }
}
