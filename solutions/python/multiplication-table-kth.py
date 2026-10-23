def find_kth_number(m, n, k):
    lo, hi = 1, m * n
    while lo < hi:
        mid = (lo + hi) // 2
        count = sum(min(n, mid // i) for i in range(1, m + 1))
        if count >= k:
            hi = mid
        else:
            lo = mid + 1
    return lo
