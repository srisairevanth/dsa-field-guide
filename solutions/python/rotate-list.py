def rotate_right(head, k):
    if not head:
        return None
    length = 1
    tail = head
    while tail.next:
        tail = tail.next
        length += 1
    k %= length
    if k == 0:
        return head
    cut = head
    for _ in range(length - k - 1):
        cut = cut.next
    new_head = cut.next
    cut.next = None
    tail.next = head
    return new_head
