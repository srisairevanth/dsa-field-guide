def count_groups(graph):
    seen = set()
    groups = 0
    for start in graph:
        if start in seen:
            continue
        groups += 1
        seen.add(start)
        stack = [start]
        while stack:
            person = stack.pop()
            for friend in graph.get(person, []):
                if friend not in seen:
                    seen.add(friend)
                    stack.append(friend)
    return groups
