def max_in_list(head):
    best = head.val
    node = head.next
    while node:
        best = max(best, node.val)
        node = node.next
    return best
