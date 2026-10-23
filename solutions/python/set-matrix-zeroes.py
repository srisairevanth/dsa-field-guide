def set_zeroes(m):
    rows = {r for r, row in enumerate(m) for x in row if x == 0}
    cols = {c for row in m for c, x in enumerate(row) if x == 0}
    for r in range(len(m)):
        for c in range(len(m[0])):
            if r in rows or c in cols:
                m[r][c] = 0
    return m
