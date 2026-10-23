def character_replacement(s, k):
    counts = {}
    best = lo = top = 0
    for hi, ch in enumerate(s):
        counts[ch] = counts.get(ch, 0) + 1
        top = max(top, counts[ch])
        while (hi - lo + 1) - top > k:
            counts[s[lo]] -= 1
            lo += 1
        best = max(best, hi - lo + 1)
    return best
