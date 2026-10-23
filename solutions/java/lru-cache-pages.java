import java.util.*;

class LRUCache {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> items;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.items = new LinkedHashMap<>(16, 0.75f, true);
    }

    public int get(int key) {
        Integer value = items.get(key);
        return value == null ? -1 : value;
    }

    public void put(int key, int value) {
        items.put(key, value);
        if (items.size() > capacity) {
            Integer eldest = items.keySet().iterator().next();
            items.remove(eldest);
        }
    }
}
