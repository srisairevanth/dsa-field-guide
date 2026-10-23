bool canPlaceFlowers(const vector<int>& flowerbed, int n) {
    vector<int> plots;
    plots.push_back(0);
    plots.insert(plots.end(), flowerbed.begin(), flowerbed.end());
    plots.push_back(0);
    int placed = 0;
    for (size_t i = 1; i + 1 < plots.size(); i++) {
        if (plots[i - 1] == 0 && plots[i] == 0 && plots[i + 1] == 0) {
            plots[i] = 1;
            placed++;
        }
    }
    return placed >= n;
}
