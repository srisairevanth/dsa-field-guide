def array_pair_sum(nums):
    ordered = sorted(nums)
    return sum(ordered[0::2])
