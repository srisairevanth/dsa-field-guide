def trap(h):
    lo, hi = 0, len(h) - 1
    left = right = total = 0
    while lo < hi:
        if h[lo] < h[hi]:
            left = max(left, h[lo])
            total += left - h[lo]
            lo += 1
        else:
            right = max(right, h[hi])
            total += right - h[hi]
            hi -= 1
    return total
