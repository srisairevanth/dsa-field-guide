int thirdMax(const vector<int>& nums) {
    set<int> distinct(nums.begin(), nums.end());
    vector<int> top(distinct.rbegin(), distinct.rend());
    return top.size() >= 3 ? top[2] : top[0];
}
