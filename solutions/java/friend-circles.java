class DisjointSet {
    private final int[] parent;
    private int components;

    public DisjointSet(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        components = n;
    }

    private int find(int x) {
        while (parent[x] != x) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }

    public void union(int a, int b) {
        int ra = find(a), rb = find(b);
        if (ra != rb) {
            parent[ra] = rb;
            components--;
        }
    }

    public boolean connected(int a, int b) {
        return find(a) == find(b);
    }

    public int count() {
        return components;
    }
}
