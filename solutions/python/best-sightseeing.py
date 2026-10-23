def max_score_sightseeing(values):
    best = -float('inf')
    best_left = values[0]
    for j in range(1, len(values)):
        best = max(best, best_left + values[j] - j)
        best_left = max(best_left, values[j] + j)
    return best
