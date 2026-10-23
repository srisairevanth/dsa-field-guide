def min_days(bloom_day, m, k):
    if m * k > len(bloom_day):
        return -1
    lo, hi = min(bloom_day), max(bloom_day)
    while lo < hi:
        mid = (lo + hi) // 2
        bouquets = run = 0
        for d in bloom_day:
            if d <= mid:
                run += 1
                if run == k:
                    bouquets += 1
                    run = 0
            else:
                run = 0
        if bouquets >= m:
            hi = mid
        else:
            lo = mid + 1
    return lo
