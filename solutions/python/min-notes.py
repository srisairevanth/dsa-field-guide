def min_notes(amount, notes):
    best = [float('inf')] * (amount + 1)
    best[0] = 0
    for a in range(1, amount + 1):
        for note in notes:
            if note <= a and best[a - note] + 1 < best[a]:
                best[a] = best[a - note] + 1
    return -1 if best[amount] == float('inf') else best[amount]
