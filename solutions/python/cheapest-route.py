import heapq

def shortest_time(graph, src, dst):
    dist = {src: 0}
    heap = [(0, src)]
    while heap:
        d, node = heapq.heappop(heap)
        if node == dst:
            return d
        if d > dist.get(node, float('inf')):
            continue
        for nxt, w in graph.get(node, []):
            nd = d + w
            if nd < dist.get(nxt, float('inf')):
                dist[nxt] = nd
                heapq.heappush(heap, (nd, nxt))
    return -1
