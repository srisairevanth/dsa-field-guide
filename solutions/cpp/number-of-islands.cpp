int countIslands(const vector<vector<int>>& grid) {
    int rows = (int)grid.size();
    int cols = rows ? (int)grid[0].size() : 0;
    vector<vector<bool>> seen(rows, vector<bool>(cols, false));
    int dy[] = {1, -1, 0, 0}, dx[] = {0, 0, 1, -1};
    int count = 0;
    for (int r = 0; r < rows; r++) {
        for (int c = 0; c < cols; c++) {
            if (grid[r][c] != 1 || seen[r][c]) continue;
            count++;
            vector<pair<int, int>> stack = {{r, c}};
            seen[r][c] = true;
            while (!stack.empty()) {
                auto [y, x] = stack.back();
                stack.pop_back();
                for (int d = 0; d < 4; d++) {
                    int ny = y + dy[d], nx = x + dx[d];
                    if (ny >= 0 && ny < rows && nx >= 0 && nx < cols && grid[ny][nx] == 1 && !seen[ny][nx]) {
                        seen[ny][nx] = true;
                        stack.push_back({ny, nx});
                    }
                }
            }
        }
    }
    return count;
}
