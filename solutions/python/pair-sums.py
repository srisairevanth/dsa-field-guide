def pair_sums(head):
    values = []
    node = head
    while node:
        values.append(node.val)
        node = node.next
    return [values[i] + values[i + 1] for i in range(len(values) - 1)]
