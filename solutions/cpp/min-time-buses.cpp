int minimumTime(const vector<int>& times, int totalTrips) {
    long long lo = 1, hi = (long long)*min_element(times.begin(), times.end()) * totalTrips;
    while (lo < hi) {
        long long mid = (lo + hi) / 2;
        long long trips = 0;
        for (int t : times) trips += mid / t;
        if (trips >= totalTrips) hi = mid;
        else lo = mid + 1;
    }
    return (int)lo;
}
