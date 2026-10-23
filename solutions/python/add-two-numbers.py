def add_two_numbers(a, b):
    dummy = ListNode()
    tail = dummy
    carry = 0
    while a or b or carry:
        total = carry
        if a:
            total += a.val
            a = a.next
        if b:
            total += b.val
            b = b.next
        tail.next = ListNode(total % 10)
        tail = tail.next
        carry = total // 10
    return dummy.next
