def height_checker(heights):
    return sum(1 for a, b in zip(heights, sorted(heights)) if a != b)
