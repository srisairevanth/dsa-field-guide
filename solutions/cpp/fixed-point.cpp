int fixedPoint(const vector<int>& nums) {
    int lo = 0, hi = (int)nums.size() - 1, answer = -1;
    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;
        if (nums[mid] == mid) {
            answer = mid;
            hi = mid - 1;
        } else if (nums[mid] < mid) {
            lo = mid + 1;
        } else {
            hi = mid - 1;
        }
    }
    return answer;
}
