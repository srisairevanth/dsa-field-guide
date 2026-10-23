long long largestRectangle(const vector<int>& heights) {
    vector<int> stack;
    long long best = 0;
    int n = (int)heights.size();
    for (int i = 0; i <= n; i++) {
        int h = i < n ? heights[i] : 0;
        while (!stack.empty() && heights[stack.back()] >= h) {
            int top = stack.back();
            stack.pop_back();
            int width = stack.empty() ? i : i - stack.back() - 1;
            best = max(best, (long long)heights[top] * width);
        }
        stack.push_back(i);
    }
    return best;
}
