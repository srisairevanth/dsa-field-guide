def duplicate_zeros(arr):
    out = []
    for x in arr:
        out.append(x)
        if x == 0:
            out.append(0)
    return out[:len(arr)]
