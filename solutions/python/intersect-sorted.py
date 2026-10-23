def intersect(a, b):
    other = set(b)
    out = []
    for x in a:
        if x in other and x not in out:
            out.append(x)
    return out
