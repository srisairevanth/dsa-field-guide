def reverse_k_group(head, k):
    def length(node):
        n = 0
        while node:
            n += 1
            node = node.next
        return n

    dummy = ListNode(0, head)
    prev = dummy
    remaining = length(head)
    while remaining >= k:
        first = prev.next
        cur = first
        last_prev = None
        for _ in range(k):
            nxt = cur.next
            cur.next = last_prev
            last_prev = cur
            cur = nxt
        prev.next = last_prev
        first.next = cur
        prev = first
        remaining -= k
    return dummy.next
