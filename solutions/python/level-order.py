def level_order(root):
    if not root:
        return []
    levels = []
    queue = [root]
    while queue:
        levels.append([node.val for node in queue])
        queue = [child for node in queue for child in (node.left, node.right) if child]
    return levels
