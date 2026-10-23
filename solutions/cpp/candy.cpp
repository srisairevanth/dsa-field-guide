int candy(const vector<int>& ratings) {
    int n = (int)ratings.size();
    vector<int> out(n, 1);
    for (int i = 1; i < n; i++)
        if (ratings[i] > ratings[i - 1]) out[i] = out[i - 1] + 1;
    for (int i = n - 2; i >= 0; i--)
        if (ratings[i] > ratings[i + 1]) out[i] = max(out[i], out[i + 1] + 1);
    long long total = 0;
    for (int x : out) total += x;
    return (int)total;
}
