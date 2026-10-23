def find_disappeared_numbers(nums):
    present = set(nums)
    return [v for v in range(1, len(nums) + 1) if v not in present]
