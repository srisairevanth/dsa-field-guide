int longestMountain(const vector<int>& arr) {
    int best = 0, n = (int)arr.size();
    int i = 1;
    while (i < n - 1) {
        if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
            int lo = i;
            while (lo > 0 && arr[lo - 1] < arr[lo]) lo--;
            int hi = i;
            while (hi < n - 1 && arr[hi] > arr[hi + 1]) hi++;
            best = max(best, hi - lo + 1);
            i = hi;
        } else {
            i++;
        }
    }
    return best;
}
