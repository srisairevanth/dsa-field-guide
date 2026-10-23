import java.util.*;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, int success) {
        int[] ordered = potions.clone();
        Arrays.sort(ordered);
        int[] out = new int[spells.length];
        for (int i = 0; i < spells.length; i++) {
            long need = ((long) success + spells[i] - 1) / spells[i];
            int lo = 0, hi = ordered.length;
            while (lo < hi) {
                int mid = (lo + hi) >>> 1;
                if (ordered[mid] < need) lo = mid + 1;
                else hi = mid;
            }
            out[i] = ordered.length - lo;
        }
        return out;
    }
}
