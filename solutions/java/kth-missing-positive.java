import java.util.*;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> present = new HashSet<>();
        for (int x : arr) present.add(x);
        int missing = 0, value = 0;
        while (true) {
            value++;
            if (!present.contains(value)) {
                missing++;
                if (missing == k) return value;
            }
        }
    }
}
