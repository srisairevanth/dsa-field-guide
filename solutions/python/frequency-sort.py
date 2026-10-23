from collections import Counter

def frequency_sort(s):
    counts = Counter(s)
    ordered = sorted(counts, key=lambda ch: (-counts[ch], ch))
    return ''.join(ch * counts[ch] for ch in ordered)
