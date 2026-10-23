def count_binary_substrings(s):
    runs = []
    i = 0
    while i < len(s):
        j = i
        while j < len(s) and s[j] == s[i]:
            j += 1
        runs.append(j - i)
        i = j
    return sum(min(a, b) for a, b in zip(runs, runs[1:]))
