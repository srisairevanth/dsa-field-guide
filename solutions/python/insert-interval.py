def insert_interval(intervals, new):
    out = []
    start, end = new
    placed = False
    for a, b in intervals:
        if b < start:
            out.append([a, b])
        elif end < a:
            if not placed:
                out.append([start, end])
                placed = True
            out.append([a, b])
        else:
            start = min(start, a)
            end = max(end, b)
    if not placed:
        out.append([start, end])
    return out
