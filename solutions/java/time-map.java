import java.util.*;

class TimeMap {
    private static class Entry {
        final int timestamp;
        final String value;

        Entry(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    private final Map<String, List<Entry>> store = new HashMap<>();

    public void set(String key, String value, int timestamp) {
        store.computeIfAbsent(key, k -> new ArrayList<>()).add(new Entry(timestamp, value));
    }

    public String get(String key, int timestamp) {
        List<Entry> entries = store.getOrDefault(key, List.of());
        int lo = 0, hi = entries.size();
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            if (entries.get(mid).timestamp <= timestamp) lo = mid + 1;
            else hi = mid;
        }
        return lo > 0 ? entries.get(lo - 1).value : "";
    }
}
