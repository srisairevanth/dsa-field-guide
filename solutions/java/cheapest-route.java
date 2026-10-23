import java.util.*;

class Edge {
    final String to;
    final int w;

    Edge(String to, int w) {
        this.to = to;
        this.w = w;
    }
}

class Solution {
    private static class Item {
        final int d;
        final String node;

        Item(int d, String node) {
            this.d = d;
            this.node = node;
        }
    }

    public int shortestTime(Map<String, List<Edge>> graph, String src, String dst) {
        Map<String, Integer> dist = new HashMap<>();
        dist.put(src, 0);
        PriorityQueue<Item> heap = new PriorityQueue<>((a, b) -> Integer.compare(a.d, b.d));
        heap.add(new Item(0, src));
        while (!heap.isEmpty()) {
            Item cur = heap.poll();
            if (cur.node.equals(dst)) return cur.d;
            Integer known = dist.get(cur.node);
            if (known != null && cur.d > known) continue;
            List<Edge> edges = graph.get(cur.node);
            if (edges == null) continue;
            for (Edge e : edges) {
                int nd = cur.d + e.w;
                Integer seen = dist.get(e.to);
                if (seen == null || nd < seen) {
                    dist.put(e.to, nd);
                    heap.add(new Item(nd, e.to));
                }
            }
        }
        return -1;
    }
}
