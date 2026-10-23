def rotate_matrix(m):
    return [list(row) for row in zip(*m[::-1])]
