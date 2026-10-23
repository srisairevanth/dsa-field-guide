int countQueens(int n) {
    vector<bool> cols(n, false), diag(2 * n, false), anti(2 * n, false);
    function<int(int)> place = [&](int row) -> int {
        if (row == n) return 1;
        int total = 0;
        for (int c = 0; c < n; c++) {
            int d = row - c + n, a = row + c;
            if (cols[c] || diag[d] || anti[a]) continue;
            cols[c] = true;
            diag[d] = true;
            anti[a] = true;
            total += place(row + 1);
            cols[c] = false;
            diag[d] = false;
            anti[a] = false;
        }
        return total;
    };
    return place(0);
}
