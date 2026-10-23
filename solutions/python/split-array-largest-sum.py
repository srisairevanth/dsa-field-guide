def split_array(nums, m):
    lo, hi = max(nums), sum(nums)
    while lo < hi:
        mid = (lo + hi) // 2
        parts, total = 1, 0
        for x in nums:
            if total + x > mid:
                parts += 1
                total = 0
            total += x
        if parts <= m:
            hi = mid
        else:
            lo = mid + 1
    return lo
