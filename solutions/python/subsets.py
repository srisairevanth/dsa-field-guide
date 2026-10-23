def subsets(nums):
    result = [[]]
    for x in nums:
        result += [s + [x] for s in result]
    return result
