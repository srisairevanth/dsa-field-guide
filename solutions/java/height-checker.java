import java.util.*;

class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
        int mismatches = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) mismatches++;
        }
        return mismatches;
    }
}
