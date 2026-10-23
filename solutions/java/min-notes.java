import java.util.*;

class Solution {
    public int minNotes(int amount, int[] notes) {
        final int INF = Integer.MAX_VALUE / 2;
        int[] best = new int[amount + 1];
        Arrays.fill(best, INF);
        best[0] = 0;
        for (int a = 1; a <= amount; a++) {
            for (int note : notes) {
                if (note <= a && best[a - note] + 1 < best[a]) best[a] = best[a - note] + 1;
            }
        }
        return best[amount] >= INF ? -1 : best[amount];
    }
}
