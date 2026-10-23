def keep_first_occurrence(head):
    seen = set()
    dummy = ListNode(0, head)
    prev = dummy
    cur = head
    while cur:
        if cur.val in seen:
            prev.next = cur.next
        else:
            seen.add(cur.val)
            prev = cur
        cur = cur.next
    return dummy.next
