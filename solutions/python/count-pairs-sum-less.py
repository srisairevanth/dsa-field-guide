def count_pairs_below(nums, limit):
    ordered = sorted(nums)
    i, j = 0, len(ordered) - 1
    count = 0
    while i < j:
        if ordered[i] + ordered[j] < limit:
            count += j - i
            i += 1
        else:
            j -= 1
    return count
