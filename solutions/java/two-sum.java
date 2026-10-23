import java.util.*;

class Solution {
    public int[] twoSum(int[] prices, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int j = 0; j < prices.length; j++) {
            Integer i = seen.get(target - prices[j]);
            if (i != null) return new int[] { i, j };
            seen.put(prices[j], j);
        }
        return new int[0];
    }
}
