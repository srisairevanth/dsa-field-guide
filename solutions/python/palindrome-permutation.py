from collections import Counter

def can_make_palindrome(s):
    odd = sum(1 for c in Counter(s).values() if c % 2)
    return odd <= 1
