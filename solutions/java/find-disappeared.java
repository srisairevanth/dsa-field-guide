import java.util.*;

class Solution {
    public int[] findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 1];
        for (int x : nums) {
            if (x >= 1 && x <= n) present[x] = true;
        }
        List<Integer> missing = new ArrayList<>();
        for (int v = 1; v <= n; v++) {
            if (!present[v]) missing.add(v);
        }
        return missing.stream().mapToInt(Integer::intValue).toArray();
    }
}
