def keep_evens(head):
    out = []
    node = head
    while node:
        if node.val % 2 == 0:
            out.append(node.val)
        node = node.next
    return out
