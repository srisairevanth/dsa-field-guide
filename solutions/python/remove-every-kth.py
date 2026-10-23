def remove_every_kth(head, k):
    dummy = ListNode(0, head)
    cur = dummy
    count = 0
    while cur.next:
        count += 1
        if count % k == 0:
            cur.next = cur.next.next
        else:
            cur = cur.next
    return dummy.next
