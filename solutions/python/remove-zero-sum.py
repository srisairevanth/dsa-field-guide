def remove_zero_sum_sublists(head):
    dummy = ListNode(0, head)
    prefix = 0
    seen = {0: dummy}
    node = dummy
    while node:
        prefix += node.val
        seen[prefix] = node
        node = node.next
    prefix = 0
    node = dummy
    while node:
        prefix += node.val
        node.next = seen[prefix].next
        node = node.next
    return dummy.next
