bool wordSearch(vector<vector<char>> grid, const string& word) {
    int rows = (int)grid.size();
    int cols = rows ? (int)grid[0].size() : 0;
    function<bool(int, int, int)> dfs = [&](int r, int c, int k) -> bool {
        if (k == (int)word.size()) return true;
        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] != word[k]) return false;
        char saved = grid[r][c];
        grid[r][c] = '#';
        int dr[] = {1, -1, 0, 0}, dc[] = {0, 0, 1, -1};
        bool found = false;
        for (int d = 0; d < 4 && !found; d++) found = dfs(r + dr[d], c + dc[d], k + 1);
        grid[r][c] = saved;
        return found;
    };
    for (int r = 0; r < rows; r++)
        for (int c = 0; c < cols; c++)
            if (dfs(r, c, 0)) return true;
    return false;
}
