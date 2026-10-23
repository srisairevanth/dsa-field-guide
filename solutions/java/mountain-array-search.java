class Solution {
    public int mountainSearch(int[] arr, int target) {
        int n = arr.length;
        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (arr[mid] < arr[mid + 1]) lo = mid + 1;
            else hi = mid;
        }
        int peak = lo;
        int found = search(arr, 0, peak, target, true);
        if (found != -1) return found;
        return search(arr, peak + 1, n - 1, target, false);
    }

    private int search(int[] arr, int a, int b, int target, boolean ascending) {
        while (a <= b) {
            int mid = (a + b) >>> 1;
            if (arr[mid] == target) return mid;
            if ((arr[mid] < target) == ascending) a = mid + 1;
            else b = mid - 1;
        }
        return -1;
    }
}
