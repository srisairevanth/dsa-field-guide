import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new LinkedHashMap<>();
        for (int x : nums) counts.merge(x, 1, Integer::sum);
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(counts.entrySet());
        entries.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        int[] out = new int[Math.min(k, entries.size())];
        for (int i = 0; i < out.length; i++) out[i] = entries.get(i).getKey();
        return out;
    }
}
