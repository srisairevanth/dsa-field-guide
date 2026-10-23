def kth_from_end(head, k):
    fast = slow = head
    for _ in range(k):
        fast = fast.next
    while fast:
        fast = fast.next
        slow = slow.next
    return slow.val
