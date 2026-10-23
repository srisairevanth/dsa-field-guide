import java.util.*;

class Solution {
    public int minPieces(int amount, int[] denominations) {
        final int INF = Integer.MAX_VALUE / 2;
        int[] best = new int[amount + 1];
        Arrays.fill(best, INF);
        best[0] = 0;
        for (int a = 1; a <= amount; a++)
            for (int d : denominations)
                if (d <= a && best[a - d] + 1 < best[a])
                    best[a] = best[a - d] + 1;
        return best[amount] >= INF ? -1 : best[amount];
    }
}
