def digits_to_number(head):
    value = 0
    node = head
    while node:
        value = value * 10 + node.val
        node = node.next
    return value
