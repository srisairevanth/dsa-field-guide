import java.util.*;

class Solution {
    public long countInversions(int[] nums) {
        int[] a = Arrays.copyOf(nums, nums.length);
        int[] buf = new int[a.length];
        return mergeCount(a, buf, 0, a.length);
    }

    private long mergeCount(int[] a, int[] buf, int lo, int hi) {
        if (hi - lo <= 1) return 0;
        int mid = (lo + hi) / 2;
        long count = mergeCount(a, buf, lo, mid) + mergeCount(a, buf, mid, hi);
        int i = lo, j = mid, k = lo;
        while (i < mid && j < hi) {
            if (a[i] <= a[j]) {
                buf[k++] = a[i++];
            } else {
                buf[k++] = a[j++];
                count += mid - i;
            }
        }
        while (i < mid) buf[k++] = a[i++];
        while (j < hi) buf[k++] = a[j++];
        System.arraycopy(buf, lo, a, lo, hi - lo);
        return count;
    }
}
