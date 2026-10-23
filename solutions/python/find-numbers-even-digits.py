def find_numbers(nums):
    return sum(1 for x in nums if len(str(abs(x))) % 2 == 0)
