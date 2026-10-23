def min_pieces(amount, denominations):
    best = [float('inf')] * (amount + 1)
    best[0] = 0
    for a in range(1, amount + 1):
        for d in denominations:
            if d <= a and best[a - d] + 1 < best[a]:
                best[a] = best[a - d] + 1
    return -1 if best[amount] == float('inf') else best[amount]
