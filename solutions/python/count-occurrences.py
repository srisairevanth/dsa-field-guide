def count_occurrences(nums, t):
    lo, hi = 0, len(nums)
    while lo < hi:
        mid = (lo + hi) // 2
        if nums[mid] < t:
            lo = mid + 1
        else:
            hi = mid
    first = lo
    lo, hi = first, len(nums)
    while lo < hi:
        mid = (lo + hi) // 2
        if nums[mid] <= t:
            lo = mid + 1
        else:
            hi = mid
    return lo - first
