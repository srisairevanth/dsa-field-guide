class DisjointSet:
    def __init__(self, n):
        self.parent = list(range(n))
        self.components = n

    def _find(self, x):
        while self.parent[x] != x:
            self.parent[x] = self.parent[self.parent[x]]
            x = self.parent[x]
        return x

    def union(self, a, b):
        ra, rb = self._find(a), self._find(b)
        if ra != rb:
            self.parent[ra] = rb
            self.components -= 1

    def connected(self, a, b):
        return self._find(a) == self._find(b)

    def count(self):
        return self.components
