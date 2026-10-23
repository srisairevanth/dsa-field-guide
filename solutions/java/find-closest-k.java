import java.util.*;

class Solution {
    public int[] findClosestElements(int[] arr, int k, double x) {
        List<Integer> ranked = new ArrayList<>();
        for (int v : arr) ranked.add(v);
        ranked.sort((p, q) -> {
            int byDistance = Double.compare(Math.abs(p - x), Math.abs(q - x));
            return byDistance != 0 ? byDistance : Integer.compare(p, q);
        });
        List<Integer> chosen = new ArrayList<>(ranked.subList(0, Math.min(k, ranked.size())));
        Collections.sort(chosen);
        return chosen.stream().mapToInt(Integer::intValue).toArray();
    }
}
