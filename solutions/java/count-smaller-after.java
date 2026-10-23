import java.util.*;

class Solution {
    public int[] countSmaller(int[] nums) {
        List<Integer> seen = new ArrayList<>();
        int[] out = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int x = nums[i];
            int lo = 0, hi = seen.size();
            while (lo < hi) {
                int mid = (lo + hi) >>> 1;
                if (seen.get(mid) < x) lo = mid + 1;
                else hi = mid;
            }
            out[i] = lo;
            seen.add(lo, x);
        }
        return out;
    }
}
