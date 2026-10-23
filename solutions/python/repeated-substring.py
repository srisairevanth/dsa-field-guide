def repeated_substring(s):
    return bool(s) and s in (s + s)[1:-1]
