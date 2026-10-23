def add_numbers_forward(a, b):
    def to_list(node):
        out = []
        while node:
            out.append(node.val)
            node = node.next
        return out
    x, y = to_list(a), to_list(b)
    carry = 0
    out = []
    i, j = len(x) - 1, len(y) - 1
    while i >= 0 or j >= 0 or carry:
        total = carry
        if i >= 0:
            total += x[i]
            i -= 1
        if j >= 0:
            total += y[j]
            j -= 1
        out.append(total % 10)
        carry = total // 10
    return out[::-1]
