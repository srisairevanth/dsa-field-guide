def is_perfect_square(num):
    lo, hi = 1, num
    while lo <= hi:
        mid = (lo + hi) // 2
        if mid * mid == num:
            return True
        if mid * mid < num:
            lo = mid + 1
        else:
            hi = mid - 1
    return False
