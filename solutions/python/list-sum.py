def list_sum(head):
    total = 0
    node = head
    while node:
        total += node.val
        node = node.next
    return total
