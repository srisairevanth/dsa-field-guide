def remove_greater_to_right(head):
    values = []
    node = head
    while node:
        values.append(node)
        node = node.next
    dummy = ListNode(0)
    tail = dummy
    best = float('-inf')
    keep = []
    for n in reversed(values):
        if n.val >= best:
            keep.append(n)
            best = n.val
    for n in reversed(keep):
        tail.next = n
        tail = n
    tail.next = None
    return dummy.next
