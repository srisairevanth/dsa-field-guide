def closest_pair_sum(nums, target):
    ordered = sorted(nums)
    i, j = 0, len(ordered) - 1
    best = ordered[0] + ordered[1]
    while i < j:
        s = ordered[i] + ordered[j]
        if abs(s - target) < abs(best - target):
            best = s
        if s < target:
            i += 1
        elif s > target:
            j -= 1
        else:
            return s
    return best
