def replace_elements(arr):
    out = [-1] * len(arr)
    best = -1
    for i in range(len(arr) - 1, -1, -1):
        out[i] = best
        best = max(best, arr[i])
    return out
