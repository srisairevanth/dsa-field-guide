def remove_elements(head, value):
    dummy = ListNode(0, head)
    cur = dummy
    while cur.next:
        if cur.next.val == value:
            cur.next = cur.next.next
        else:
            cur = cur.next
    return dummy.next
