def double_number(head):
    digits = []
    node = head
    while node:
        digits.append(node.val)
        node = node.next
    carry = 0
    out = []
    for d in reversed(digits):
        total = d * 2 + carry
        out.append(total % 10)
        carry = total // 10
    if carry:
        out.append(carry)
    return out[::-1]
