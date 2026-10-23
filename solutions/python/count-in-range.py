import bisect

def count_in_range(nums, low, high):
    ordered = sorted(nums)
    return bisect.bisect_right(ordered, high) - bisect.bisect_left(ordered, low)
