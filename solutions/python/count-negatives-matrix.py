def count_negatives(grid):
    return sum(1 for row in grid for x in row if x < 0)
