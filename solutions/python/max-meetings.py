def max_meetings(meetings):
    count = 0
    last_end = float('-inf')
    for start, end in sorted(meetings, key=lambda m: m[1]):
        if start > last_end:
            count += 1
            last_end = end
    return count
