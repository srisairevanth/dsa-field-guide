def next_greater_nodes(head):
    values = []
    node = head
    while node:
        values.append(node.val)
        node = node.next
    out = [0] * len(values)
    stack = []
    for i, v in enumerate(values):
        while stack and values[stack[-1]] < v:
            out[stack.pop()] = v
        stack.append(i)
    return out
