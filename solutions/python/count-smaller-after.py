import bisect

def count_smaller(nums):
    seen = []
    out = []
    for x in reversed(nums):
        out.append(bisect.bisect_left(seen, x))
        bisect.insort(seen, x)
    return list(reversed(out))
