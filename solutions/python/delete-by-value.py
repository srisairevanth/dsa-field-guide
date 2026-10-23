def delete_first_value(head, value):
    dummy = ListNode(0, head)
    prev = dummy
    while prev.next:
        if prev.next.val == value:
            prev.next = prev.next.next
            break
        prev = prev.next
    return dummy.next
