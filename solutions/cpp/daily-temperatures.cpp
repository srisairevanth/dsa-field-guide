vector<int> dailyTemperatures(const vector<int>& temps) {
    vector<int> result(temps.size(), 0);
    vector<int> stack;
    for (int i = 0; i < (int)temps.size(); i++) {
        while (!stack.empty() && temps[stack.back()] < temps[i]) {
            int j = stack.back();
            stack.pop_back();
            result[j] = i - j;
        }
        stack.push_back(i);
    }
    return result;
}
