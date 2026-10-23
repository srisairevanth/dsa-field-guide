int closestPairSum(const vector<int>& nums, int target) {
    vector<int> ordered = nums;
    sort(ordered.begin(), ordered.end());
    int i = 0, j = (int)ordered.size() - 1;
    long long best = (long long)ordered[0] + ordered[1];
    while (i < j) {
        long long s = (long long)ordered[i] + ordered[j];
        if (llabs(s - target) < llabs(best - target)) best = s;
        if (s < target) i++;
        else if (s > target) j--;
        else return (int)s;
    }
    return (int)best;
}
