int maxScoreSightseeing(const vector<int>& values) {
    long long best = LLONG_MIN, bestLeft = values[0];
    for (int j = 1; j < (int)values.size(); j++) {
        best = max(best, bestLeft + values[j] - j);
        bestLeft = max(bestLeft, (long long)values[j] + j);
    }
    return (int)best;
}
