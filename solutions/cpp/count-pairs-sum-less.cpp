int countPairsBelow(const vector<int>& nums, int limit) {
    vector<int> ordered = nums;
    sort(ordered.begin(), ordered.end());
    int i = 0, j = (int)ordered.size() - 1;
    long long count = 0;
    while (i < j) {
        if ((long long)ordered[i] + ordered[j] < limit) {
            count += j - i;
            i++;
        } else {
            j--;
        }
    }
    return (int)count;
}
