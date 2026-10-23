def length_of_two_distinct(s):
    counts = {}
    best = lo = 0
    for hi, ch in enumerate(s):
        counts[ch] = counts.get(ch, 0) + 1
        while len(counts) > 2:
            counts[s[lo]] -= 1
            if counts[s[lo]] == 0:
                del counts[s[lo]]
            lo += 1
        best = max(best, hi - lo + 1)
    return best
