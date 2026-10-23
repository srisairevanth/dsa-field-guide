import java.util.*;

class Solution {
    public int closestPairSum(int[] nums, int target) {
        int[] ordered = nums.clone();
        Arrays.sort(ordered);
        int i = 0, j = ordered.length - 1;
        int best = ordered[0] + ordered[1];
        while (i < j) {
            int s = ordered[i] + ordered[j];
            if (Math.abs(s - target) < Math.abs(best - target)) best = s;
            if (s < target) i++;
            else if (s > target) j--;
            else return s;
        }
        return best;
    }
}
