def is_valid(s):
    partner = {')': '(', ']': '[', '}': '{'}
    stack = []
    for ch in s:
        if ch in partner:
            if not stack or stack.pop() != partner[ch]:
                return False
        else:
            stack.append(ch)
    return len(stack) == 0
