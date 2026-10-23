def group_anagrams(words):
    groups = {}
    for w in words:
        groups.setdefault(''.join(sorted(w)), []).append(w)
    return list(groups.values())
