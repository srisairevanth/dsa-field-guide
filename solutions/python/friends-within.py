def friends_within(graph, start, k):
    seen = {start}
    ring = [start]
    for _ in range(k):
        nxt = []
        for person in ring:
            for friend in graph.get(person, []):
                if friend not in seen:
                    seen.add(friend)
                    nxt.append(friend)
        ring = nxt
    return len(seen) - 1
