vector<int> pairSumSorted(const vector<int>& values, int target) {
    int i = 0, j = (int)values.size() - 1;
    while (i < j) {
        int s = values[i] + values[j];
        if (s == target) return {i, j};
        if (s < target) i++;
        else j--;
    }
    return {};
}
