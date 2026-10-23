def longest_run(nums):
    seen = set(nums)
    best = 0
    for x in seen:
        if x - 1 in seen:
            continue
        length = 1
        while x + length in seen:
            length += 1
        best = max(best, length)
    return best
