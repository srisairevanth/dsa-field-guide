def smaller_numbers_than_current(nums):
    return [sum(1 for y in nums if y < x) for x in nums]
