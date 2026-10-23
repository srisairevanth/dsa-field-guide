def delete_at_index(head, index):
    dummy = ListNode(0, head)
    prev = dummy
    for _ in range(index):
        if not prev.next:
            return dummy.next
        prev = prev.next
    if prev.next:
        prev.next = prev.next.next
    return dummy.next
