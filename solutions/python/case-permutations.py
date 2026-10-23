def case_permutations(s):
    out = ['']
    for ch in s:
        if ch.isalpha():
            out = [p + c for p in out for c in (ch.lower(), ch.upper())]
        else:
            out = [p + ch for p in out]
    return out
