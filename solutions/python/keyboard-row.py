def keyboard_row(words):
    rows = ['qwertyuiop', 'asdfghjkl', 'zxcvbnm']
    out = []
    for w in words:
        lower = w.lower()
        if any(set(lower) <= set(row) for row in rows):
            out.append(w)
    return out
