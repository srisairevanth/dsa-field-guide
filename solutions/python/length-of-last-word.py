def last_word_length(s):
    words = s.split()
    return len(words[-1]) if words else 0
