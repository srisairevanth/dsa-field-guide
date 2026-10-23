from collections import deque

def can_finish(num_courses, prerequisites):
    indeg = [0] * num_courses
    after = [[] for _ in range(num_courses)]
    for course, before in prerequisites:
        indeg[course] += 1
        after[before].append(course)
    queue = deque(i for i in range(num_courses) if indeg[i] == 0)
    done = 0
    while queue:
        node = queue.popleft()
        done += 1
        for nxt in after[node]:
            indeg[nxt] -= 1
            if indeg[nxt] == 0:
                queue.append(nxt)
    return done == num_courses
