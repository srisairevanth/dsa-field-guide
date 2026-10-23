import java.util.*;

class Solution {
    public int[] removeElement(int[] nums, int val) {
        int[] out = new int[nums.length];
        int k = 0;
        for (int x : nums) {
            if (x != val) out[k++] = x;
        }
        return Arrays.copyOf(out, k);
    }
}
