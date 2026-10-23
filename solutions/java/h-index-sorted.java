class Solution {
    public int hIndexSorted(int[] citations) {
        int n = citations.length;
        int lo = 0, hi = n;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (citations[mid] >= n - mid) hi = mid;
            else lo = mid + 1;
        }
        return n - lo;
    }
}
