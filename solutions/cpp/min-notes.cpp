int minNotes(int amount, const vector<int>& notes) {
    const int INF = INT_MAX / 2;
    vector<int> best(amount + 1, INF);
    best[0] = 0;
    for (int a = 1; a <= amount; a++) {
        for (int note : notes) {
            if (note <= a && best[a - note] + 1 < best[a]) best[a] = best[a - note] + 1;
        }
    }
    return best[amount] >= INF ? -1 : best[amount];
}
