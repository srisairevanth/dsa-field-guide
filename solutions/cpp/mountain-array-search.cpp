int mountainSearch(const vector<int>& arr, int target) {
    int n = (int)arr.size();
    int lo = 0, hi = n - 1;
    while (lo < hi) {
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] < arr[mid + 1]) lo = mid + 1;
        else hi = mid;
    }
    int peak = lo;
    auto search = [&](int a, int b, bool ascending) {
        while (a <= b) {
            int mid = a + (b - a) / 2;
            if (arr[mid] == target) return mid;
            if ((arr[mid] < target) == ascending) a = mid + 1;
            else b = mid - 1;
        }
        return -1;
    };
    int found = search(0, peak, true);
    if (found != -1) return found;
    return search(peak + 1, n - 1, false);
}
