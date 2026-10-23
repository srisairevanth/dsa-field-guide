import java.util.*;

class Solution {
    public int[] intersect(int[] a, int[] b) {
        Set<Integer> other = new HashSet<>();
        for (int x : b) other.add(x);
        Set<Integer> taken = new HashSet<>();
        List<Integer> out = new ArrayList<>();
        for (int x : a) {
            if (other.contains(x) && taken.add(x)) out.add(x);
        }
        return out.stream().mapToInt(Integer::intValue).toArray();
    }
}
