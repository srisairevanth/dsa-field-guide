def permutations(nums):
    if len(nums) <= 1:
        return [list(nums)]
    out = []
    for i, x in enumerate(nums):
        rest = nums[:i] + nums[i + 1:]
        for p in permutations(rest):
            out.append([x] + p)
    return out
