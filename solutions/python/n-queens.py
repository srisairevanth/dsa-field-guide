def count_queens(n):
    cols, diag, anti = set(), set(), set()

    def place(row):
        if row == n:
            return 1
        total = 0
        for c in range(n):
            if c in cols or (row - c) in diag or (row + c) in anti:
                continue
            cols.add(c); diag.add(row - c); anti.add(row + c)
            total += place(row + 1)
            cols.remove(c); diag.remove(row - c); anti.remove(row + c)
        return total

    return place(0)
