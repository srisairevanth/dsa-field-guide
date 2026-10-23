def max_consecutive_ones(nums):
    best = run = 0
    for x in nums:
        run = run + 1 if x == 1 else 0
        best = max(best, run)
    return best
