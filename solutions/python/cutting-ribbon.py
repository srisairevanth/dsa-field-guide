def max_ribbon_length(ribbons, k):
    lo, hi = 0, max(ribbons)
    while lo < hi:
        mid = (lo + hi + 1) // 2
        if sum(r // mid for r in ribbons) >= k:
            lo = mid
        else:
            hi = mid - 1
    return lo
