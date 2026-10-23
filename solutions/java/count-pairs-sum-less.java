import java.util.*;

class Solution {
    public int countPairsBelow(int[] nums, int limit) {
        int[] ordered = nums.clone();
        Arrays.sort(ordered);
        int i = 0, j = ordered.length - 1, count = 0;
        while (i < j) {
            if ((long) ordered[i] + ordered[j] < limit) {
                count += j - i;
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
