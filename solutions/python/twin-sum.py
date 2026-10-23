def max_twin_sum(head):
    values = []
    node = head
    while node:
        values.append(node.val)
        node = node.next
    n = len(values)
    return max(values[i] + values[n - 1 - i] for i in range(n // 2))
