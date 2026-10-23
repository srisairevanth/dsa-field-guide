def min_sub_array_len(target, nums):
    best = float('inf')
    total = lo = 0
    for hi, x in enumerate(nums):
        total += x
        while total >= target:
            best = min(best, hi - lo + 1)
            total -= nums[lo]
            lo += 1
    return 0 if best == float('inf') else best
