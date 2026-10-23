def range_sums(sales, queries):
    prefix = [0]
    for x in sales:
        prefix.append(prefix[-1] + x)
    return [prefix[r + 1] - prefix[l] for l, r in queries]
