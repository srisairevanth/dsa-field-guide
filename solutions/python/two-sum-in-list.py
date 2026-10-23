def has_pair_with_sum(head, target):
    seen = set()
    node = head
    while node:
        if target - node.val in seen:
            return True
        seen.add(node.val)
        node = node.next
    return False
