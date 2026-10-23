def fixed_point(nums):
    lo, hi = 0, len(nums) - 1
    answer = -1
    while lo <= hi:
        mid = (lo + hi) // 2
        if nums[mid] == mid:
            answer = mid
            hi = mid - 1
        elif nums[mid] < mid:
            lo = mid + 1
        else:
            hi = mid - 1
    return answer
