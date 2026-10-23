def move_zeroes(nums):
    keep = [x for x in nums if x != 0]
    return keep + [0] * (len(nums) - len(keep))
