import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int x : nums) {
            int n = result.size();
            for (int i = 0; i < n; i++) {
                List<Integer> s = new ArrayList<>(result.get(i));
                s.add(x);
                result.add(s);
            }
        }
        return result;
    }
}
