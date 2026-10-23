import heapq

def kth_smallest(matrix, k):
    heap = [(row[0], r, 0) for r, row in enumerate(matrix)]
    heapq.heapify(heap)
    value = None
    for _ in range(k):
        value, r, c = heapq.heappop(heap)
        if c + 1 < len(matrix[r]):
            heapq.heappush(heap, (matrix[r][c + 1], r, c + 1))
    return value
