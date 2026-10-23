def word_pattern(pattern, s):
    words = s.split()
    if len(words) != len(pattern):
        return False
    forward, backward = {}, {}
    for ch, w in zip(pattern, words):
        if forward.get(ch, w) != w or backward.get(w, ch) != ch:
            return False
        forward[ch] = w
        backward[w] = ch
    return True
