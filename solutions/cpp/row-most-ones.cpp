int rowWithMostOnes(const vector<vector<int>>& mat) {
    int bestRow = 0, best = -1;
    for (int r = 0; r < (int)mat.size(); r++) {
        int ones = 0;
        for (int x : mat[r]) ones += x;
        if (ones > best) {
            bestRow = r;
            best = ones;
        }
    }
    return bestRow;
}
