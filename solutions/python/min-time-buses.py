def minimum_time(times, total_trips):
    lo, hi = 1, min(times) * total_trips
    while lo < hi:
        mid = (lo + hi) // 2
        if sum(mid // t for t in times) >= total_trips:
            hi = mid
        else:
            lo = mid + 1
    return lo
