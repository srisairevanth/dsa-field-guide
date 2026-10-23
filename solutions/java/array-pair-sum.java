import java.util.*;

class Solution {
    public int arrayPairSum(int[] nums) {
        int[] ordered = nums.clone();
        Arrays.sort(ordered);
        int total = 0;
        for (int i = 0; i < ordered.length; i += 2) total += ordered[i];
        return total;
    }
}
