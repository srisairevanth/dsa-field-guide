def find_closest_elements(arr, k, x):
    ranked = sorted(arr, key=lambda v: (abs(v - x), v))
    return sorted(ranked[:k])
