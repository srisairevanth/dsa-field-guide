def is_one_edit(a, b):
    if len(a) > len(b):
        a, b = b, a
    if len(b) - len(a) > 1:
        return False
    for i in range(len(a)):
        if a[i] != b[i]:
            if len(a) == len(b):
                return a[i + 1:] == b[i + 1:]
            return a[i:] == b[i + 1:]
    return len(b) - len(a) == 1
