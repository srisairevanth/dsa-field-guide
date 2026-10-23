int maxMeetings(vector<vector<int>> meetings) {
    sort(meetings.begin(), meetings.end(),
         [](const vector<int>& a, const vector<int>& b) { return a[1] < b[1]; });
    int count = 0;
    int lastEnd = INT_MIN;
    for (const auto& m : meetings) {
        if (m[0] > lastEnd) {
            count++;
            lastEnd = m[1];
        }
    }
    return count;
}
