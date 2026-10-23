from collections import Counter

def sum_of_unique(nums):
    return sum(x for x, c in Counter(nums).items() if c == 1)
