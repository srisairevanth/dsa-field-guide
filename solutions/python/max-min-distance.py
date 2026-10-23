def max_min_distance(positions, m):
    positions = sorted(positions)
    lo, hi = 1, positions[-1] - positions[0]
    while lo < hi:
        mid = (lo + hi + 1) // 2
        count, last = 1, positions[0]
        for p in positions[1:]:
            if p - last >= mid:
                count += 1
                last = p
        if count >= m:
            lo = mid
        else:
            hi = mid - 1
    return lo
