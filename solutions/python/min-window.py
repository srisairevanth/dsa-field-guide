from collections import Counter

def min_window(s, t):
    need = Counter(t)
    missing = len(t)
    best_lo, best_hi = 0, -1
    lo = 0
    for hi, ch in enumerate(s):
        if need[ch] > 0:
            missing -= 1
        need[ch] -= 1
        while missing == 0:
            if best_hi < 0 or hi - lo < best_hi - best_lo:
                best_lo, best_hi = lo, hi
            need[s[lo]] += 1
            if need[s[lo]] > 0:
                missing += 1
            lo += 1
    return '' if best_hi < 0 else s[best_lo:best_hi + 1]
