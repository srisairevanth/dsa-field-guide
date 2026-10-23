def longest_mountain(arr):
    best = 0
    i, n = 1, len(arr)
    while i < n - 1:
        if arr[i - 1] < arr[i] > arr[i + 1]:
            lo = i
            while lo > 0 and arr[lo - 1] < arr[lo]:
                lo -= 1
            hi = i
            while hi < n - 1 and arr[hi] > arr[hi + 1]:
                hi += 1
            best = max(best, hi - lo + 1)
            i = hi
        else:
            i += 1
    return best
