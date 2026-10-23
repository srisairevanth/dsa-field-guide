def shortest_to_char(s, c):
    positions = [i for i, ch in enumerate(s) if ch == c]
    return [min(abs(i - p) for p in positions) for i in range(len(s))]
