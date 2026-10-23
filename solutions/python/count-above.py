def count_above(head, threshold):
    count = 0
    node = head
    while node:
        if node.val > threshold:
            count += 1
        node = node.next
    return count
