int countNegatives(const vector<vector<int>>& grid) {
    int count = 0;
    for (const auto& row : grid)
        for (int x : row)
            if (x < 0) count++;
    return count;
}
