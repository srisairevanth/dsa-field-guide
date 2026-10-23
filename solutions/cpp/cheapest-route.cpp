int shortestTime(const unordered_map<string, vector<pair<string, int>>>& graph, const string& src, const string& dst) {
    unordered_map<string, int> dist;
    dist[src] = 0;
    priority_queue<pair<int, string>, vector<pair<int, string>>, greater<>> heap;
    heap.push({0, src});
    while (!heap.empty()) {
        auto [d, node] = heap.top();
        heap.pop();
        if (node == dst) return d;
        auto known = dist.find(node);
        if (known != dist.end() && d > known->second) continue;
        auto edges = graph.find(node);
        if (edges == graph.end()) continue;
        for (const auto& [nxt, w] : edges->second) {
            int nd = d + w;
            auto seen = dist.find(nxt);
            if (seen == dist.end() || nd < seen->second) {
                dist[nxt] = nd;
                heap.push({nd, nxt});
            }
        }
    }
    return -1;
}
