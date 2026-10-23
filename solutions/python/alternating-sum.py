def alternating_sum(head):
    total = 0
    sign = 1
    node = head
    while node:
        total += sign * node.val
        sign = -sign
        node = node.next
    return total
