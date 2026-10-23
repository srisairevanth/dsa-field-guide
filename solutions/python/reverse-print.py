def reverse_print(head):
    values = []
    node = head
    while node:
        values.append(node.val)
        node = node.next
    return values[::-1]
