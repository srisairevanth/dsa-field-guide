def insert_sorted(head, value):
    dummy = ListNode(0, head)
    prev = dummy
    while prev.next and prev.next.val <= value:
        prev = prev.next
    prev.next = ListNode(value, prev.next)
    return dummy.next
