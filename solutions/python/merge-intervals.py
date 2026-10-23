def merge_intervals(intervals):
    ordered = sorted([list(x) for x in intervals], key=lambda x: x[0])
    out = []
    for start, end in ordered:
        if out and start <= out[-1][1]:
            out[-1][1] = max(out[-1][1], end)
        else:
            out.append([start, end])
    return out
