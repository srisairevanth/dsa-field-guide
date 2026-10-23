long long rob(const vector<int>& houses) {
    long long take = 0, skip = 0;
    for (int h : houses) {
        long long nextTake = skip + h;
        long long nextSkip = max(skip, take);
        take = nextTake;
        skip = nextSkip;
    }
    return max(take, skip);
}
