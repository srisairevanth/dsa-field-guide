import java.util.*;

class Solution {
    public int[][] insertInterval(int[][] intervals, int[] newInterval) {
        List<int[]> out = new ArrayList<>();
        int start = newInterval[0], end = newInterval[1];
        boolean placed = false;
        for (int[] iv : intervals) {
            int a = iv[0], b = iv[1];
            if (b < start) {
                out.add(new int[] { a, b });
            } else if (end < a) {
                if (!placed) {
                    out.add(new int[] { start, end });
                    placed = true;
                }
                out.add(new int[] { a, b });
            } else {
                start = Math.min(start, a);
                end = Math.max(end, b);
            }
        }
        if (!placed) out.add(new int[] { start, end });
        return out.toArray(new int[0][]);
    }
}
