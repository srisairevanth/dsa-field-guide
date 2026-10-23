import java.util.*;

class Solution {
    public int countInRange(int[] nums, int low, int high) {
        int[] ordered = nums.clone();
        Arrays.sort(ordered);
        return upperBound(ordered, high) - lowerBound(ordered, low);
    }

    private int upperBound(int[] a, int t) {
        int lo = 0, hi = a.length;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (a[mid] <= t) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    private int lowerBound(int[] a, int t) {
        int lo = 0, hi = a.length;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (a[mid] < t) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
