def word_search(grid, word):
    rows, cols = len(grid), len(grid[0]) if grid else 0

    def dfs(r, c, k):
        if k == len(word):
            return True
        if r < 0 or c < 0 or r >= rows or c >= cols or grid[r][c] != word[k]:
            return False
        saved = grid[r][c]
        grid[r][c] = '#'
        found = any(dfs(r + dr, c + dc, k + 1) for dr, dc in ((1, 0), (-1, 0), (0, 1), (0, -1)))
        grid[r][c] = saved
        return found

    return any(dfs(r, c, 0) for r in range(rows) for c in range(cols))
