def partition_list(head, x):
    before_dummy, after_dummy = ListNode(), ListNode()
    before, after = before_dummy, after_dummy
    while head:
        if head.val < x:
            before.next = head
            before = head
        else:
            after.next = head
            after = head
        head = head.next
    after.next = None
    before.next = after_dummy.next
    return before_dummy.next
