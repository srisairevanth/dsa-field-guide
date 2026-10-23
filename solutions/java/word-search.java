class Solution {
    private int rows, cols;
    private char[][] g;
    private String word;

    public boolean wordSearch(char[][] grid, String word) {
        rows = grid.length;
        cols = rows > 0 ? grid[0].length : 0;
        g = grid;
        this.word = word;
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                if (dfs(r, c, 0)) return true;
        return false;
    }

    private boolean dfs(int r, int c, int k) {
        if (k == word.length()) return true;
        if (r < 0 || c < 0 || r >= rows || c >= cols || g[r][c] != word.charAt(k)) return false;
        char saved = g[r][c];
        g[r][c] = '#';
        int[] dr = {1, -1, 0, 0}, dc = {0, 0, 1, -1};
        boolean found = false;
        for (int d = 0; d < 4 && !found; d++) found = dfs(r + dr[d], c + dc[d], k + 1);
        g[r][c] = saved;
        return found;
    }
}
