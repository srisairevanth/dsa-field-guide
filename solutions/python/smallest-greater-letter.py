import bisect

def next_greatest_letter(letters, target):
    i = bisect.bisect_right(letters, target)
    return letters[i % len(letters)]
