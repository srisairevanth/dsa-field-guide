def mountain_search(arr, target):
    n = len(arr)
    lo, hi = 0, n - 1
    while lo < hi:
        mid = (lo + hi) // 2
        if arr[mid] < arr[mid + 1]:
            lo = mid + 1
        else:
            hi = mid
    peak = lo

    def search(a, b, ascending):
        while a <= b:
            mid = (a + b) // 2
            if arr[mid] == target:
                return mid
            if (arr[mid] < target) == ascending:
                a = mid + 1
            else:
                b = mid - 1
        return -1

    found = search(0, peak, True)
    if found != -1:
        return found
    return search(peak + 1, n - 1, False)
