def is_palindrome_list(head):
    vals = []
    node = head
    while node:
        vals.append(node.val)
        node = node.next
    return vals == vals[::-1]
