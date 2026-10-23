class DisjointSet {
    vector<int> parent;
    int components;
    int find(int x) {
        while (parent[x] != x) {
            parent[x] = parent[parent[x]];
            x = parent[x];
        }
        return x;
    }
public:
    DisjointSet(int n) : parent(n), components(n) {
        for (int i = 0; i < n; i++) parent[i] = i;
    }
    void unite(int a, int b) {
        int ra = find(a), rb = find(b);
        if (ra != rb) {
            parent[ra] = rb;
            components--;
        }
    }
    bool connected(int a, int b) { return find(a) == find(b); }
    int count() { return components; }
};
