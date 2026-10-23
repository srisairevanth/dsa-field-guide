def three_sum(nums):
    arr = sorted(nums)
    out = []
    for i in range(len(arr) - 2):
        if i > 0 and arr[i] == arr[i - 1]:
            continue
        lo, hi = i + 1, len(arr) - 1
        while lo < hi:
            s = arr[i] + arr[lo] + arr[hi]
            if s == 0:
                out.append([arr[i], arr[lo], arr[hi]])
                lo += 1
                hi -= 1
                while lo < hi and arr[lo] == arr[lo - 1]:
                    lo += 1
            elif s < 0:
                lo += 1
            else:
                hi -= 1
    return out
