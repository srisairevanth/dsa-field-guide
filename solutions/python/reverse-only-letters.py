def reverse_only_letters(s):
    chars = list(s)
    i, j = 0, len(chars) - 1
    while i < j:
        if not chars[i].isalpha():
            i += 1
        elif not chars[j].isalpha():
            j -= 1
        else:
            chars[i], chars[j] = chars[j], chars[i]
            i += 1
            j -= 1
    return ''.join(chars)
