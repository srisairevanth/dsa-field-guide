int minPieces(int amount, const vector<int>& denominations) {
    const int INF = INT_MAX / 2;
    vector<int> best(amount + 1, INF);
    best[0] = 0;
    for (int a = 1; a <= amount; a++)
        for (int d : denominations)
            if (d <= a && best[a - d] + 1 < best[a])
                best[a] = best[a - d] + 1;
    return best[amount] >= INF ? -1 : best[amount];
}
