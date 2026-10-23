def count_palindromes(s):
    total = 0
    for center in range(2 * len(s) - 1):
        lo, hi = center // 2, center // 2 + center % 2
        while lo >= 0 and hi < len(s) and s[lo] == s[hi]:
            total += 1
            lo -= 1
            hi += 1
    return total
