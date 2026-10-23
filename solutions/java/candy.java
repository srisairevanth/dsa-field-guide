import java.util.*;

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] out = new int[n];
        Arrays.fill(out, 1);
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) out[i] = out[i - 1] + 1;
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) out[i] = Math.max(out[i], out[i + 1] + 1);
        }
        int total = 0;
        for (int x : out) total += x;
        return total;
    }
}
