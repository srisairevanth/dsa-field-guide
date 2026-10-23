import bisect

def find_radius(houses, heaters):
    hs = sorted(heaters)
    best = 0
    for h in houses:
        i = bisect.bisect_left(hs, h)
        dist = float('inf')
        if i < len(hs):
            dist = hs[i] - h
        if i > 0:
            dist = min(dist, h - hs[i - 1])
        best = max(best, dist)
    return best
