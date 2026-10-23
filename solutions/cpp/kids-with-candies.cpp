vector<bool> kidsWithCandies(const vector<int>& candies, int extra) {
    int top = *max_element(candies.begin(), candies.end());
    vector<bool> out;
    for (int c : candies) out.push_back(c + extra >= top);
    return out;
}
