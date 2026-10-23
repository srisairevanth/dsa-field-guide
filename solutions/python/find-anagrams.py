from collections import Counter

def find_anagrams(s, p):
    need = Counter(p)
    window = Counter()
    out = []
    for i, ch in enumerate(s):
        window[ch] += 1
        if i >= len(p):
            left = s[i - len(p)]
            window[left] -= 1
            if window[left] == 0:
                del window[left]
        if window == need:
            out.append(i - len(p) + 1)
    return out
