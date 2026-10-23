def word_break(s, words):
    vocab = set(words)
    ok = [True] + [False] * len(s)
    for end in range(1, len(s) + 1):
        ok[end] = any(ok[start] and s[start:end] in vocab for start in range(end))
    return ok[len(s)]
