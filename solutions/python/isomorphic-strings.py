def is_isomorphic(a, b):
    forward, backward = {}, {}
    for x, y in zip(a, b):
        if forward.get(x, y) != y or backward.get(y, x) != x:
            return False
        forward[x] = y
        backward[y] = x
    return True
