def kids_with_candies(candies, extra):
    top = max(candies)
    return [c + extra >= top for c in candies]
