def first_missing_positive(nums):
    arr = list(nums)
    n = len(arr)
    for i in range(n):
        while 1 <= arr[i] <= n and arr[arr[i] - 1] != arr[i]:
            j = arr[i] - 1
            arr[i], arr[j] = arr[j], arr[i]
    for i in range(n):
        if arr[i] != i + 1:
            return i + 1
    return n + 1
