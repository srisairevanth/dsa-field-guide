def sort_list(head):
    values = []
    node = head
    while node:
        values.append(node.val)
        node = node.next
    values.sort()
    node = head
    for v in values:
        node.val = v
        node = node.next
    return head
