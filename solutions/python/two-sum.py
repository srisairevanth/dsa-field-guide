def two_sum(prices, target):
    seen = {}
    for j, price in enumerate(prices):
        i = seen.get(target - price)
        if i is not None:
            return [i, j]
        seen[price] = j
    return []
