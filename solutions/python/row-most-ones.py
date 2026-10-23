def row_with_most_ones(mat):
    best_row, best = 0, -1
    for r, row in enumerate(mat):
        ones = sum(row)
        if ones > best:
            best_row, best = r, ones
    return best_row
