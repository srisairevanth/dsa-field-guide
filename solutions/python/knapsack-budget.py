def best_value(items, budget):
    best = [0] * (budget + 1)
    for w, v in items:
        for b in range(budget, w - 1, -1):
            best[b] = max(best[b], best[b - w] + v)
    return best[budget]
