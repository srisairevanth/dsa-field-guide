def single_number(items):
    result = 0
    for x in items:
        result ^= x
    return result
