def sort_by_parity(nums):
    return [x for x in nums if x % 2 == 0] + [x for x in nums if x % 2 != 0]
