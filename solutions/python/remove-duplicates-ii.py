def delete_all_duplicates(head):
    dummy = ListNode(0, head)
    prev = dummy
    cur = head
    while cur:
        if cur.next and cur.val == cur.next.val:
            v = cur.val
            while cur and cur.val == v:
                cur = cur.next
            prev.next = cur
        else:
            prev = cur
            cur = cur.next
    return dummy.next
