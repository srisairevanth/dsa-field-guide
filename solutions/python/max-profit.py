def max_profit(prices):
    low = float('inf')
    best = 0
    for p in prices:
        low = min(low, p)
        best = max(best, p - low)
    return best
