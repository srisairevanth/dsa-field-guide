class Solution {
    private int n;
    private boolean[] cols, diag, anti;

    public int countQueens(int n) {
        this.n = n;
        cols = new boolean[n];
        diag = new boolean[2 * n + 1];
        anti = new boolean[2 * n + 1];
        return place(0);
    }

    private int place(int row) {
        if (row == n) return 1;
        int total = 0;
        for (int c = 0; c < n; c++) {
            int d = row - c + n, a = row + c;
            if (cols[c] || diag[d] || anti[a]) continue;
            cols[c] = diag[d] = anti[a] = true;
            total += place(row + 1);
            cols[c] = diag[d] = anti[a] = false;
        }
        return total;
    }
}
