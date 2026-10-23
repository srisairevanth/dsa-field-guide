def find_kth_positive(arr, k):
    present = set(arr)
    missing = 0
    value = 0
    while True:
        value += 1
        if value not in present:
            missing += 1
            if missing == k:
                return value
