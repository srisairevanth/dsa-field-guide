import java.util.*;

class Solution {
    public long subarraySumK(int[] flows, int k) {
        long count = 0, total = 0;
        Map<Long, Long> seen = new HashMap<>();
        seen.put(0L, 1L);
        for (int x : flows) {
            total += x;
            count += seen.getOrDefault(total - k, 0L);
            seen.merge(total, 1L, Long::sum);
        }
        return count;
    }
}
