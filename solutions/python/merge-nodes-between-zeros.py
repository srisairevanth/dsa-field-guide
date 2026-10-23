def merge_between_zeros(head):
    out = []
    node = head.next
    total = 0
    while node:
        if node.val == 0:
            out.append(total)
            total = 0
        else:
            total += node.val
        node = node.next
    dummy = ListNode()
    tail = dummy
    for v in out:
        tail.next = ListNode(v)
        tail = tail.next
    return dummy.next
