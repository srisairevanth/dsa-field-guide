import bisect

def floor_value(nums, limit):
    i = bisect.bisect_right(nums, limit)
    return nums[i - 1] if i > 0 else -1
