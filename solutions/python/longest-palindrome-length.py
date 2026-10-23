from collections import Counter

def longest_palindrome_length(s):
    total = 0
    odd = False
    for c in Counter(s).values():
        total += c // 2 * 2
        if c % 2:
            odd = True
    return total + (1 if odd else 0)
