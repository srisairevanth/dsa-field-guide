import bisect

def nearest_value(nums, target):
    i = bisect.bisect_left(nums, target)
    candidates = nums[max(0, i - 1):i + 1]
    return min(candidates, key=lambda v: (abs(v - target), v))
