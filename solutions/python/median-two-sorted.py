def find_median_sorted_arrays(a, b):
    merged = sorted(a + b)
    n = len(merged)
    if n % 2 == 1:
        return merged[n // 2]
    return (merged[n // 2 - 1] + merged[n // 2]) / 2
