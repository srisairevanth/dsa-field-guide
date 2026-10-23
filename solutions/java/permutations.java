import java.util.*;

class Solution {
    public List<List<Integer>> permutations(int[] nums) {
        List<Integer> items = new ArrayList<>();
        for (int x : nums) items.add(x);
        return perms(items);
    }

    private List<List<Integer>> perms(List<Integer> nums) {
        List<List<Integer>> out = new ArrayList<>();
        if (nums.size() <= 1) {
            out.add(new ArrayList<>(nums));
            return out;
        }
        for (int i = 0; i < nums.size(); i++) {
            List<Integer> rest = new ArrayList<>(nums);
            int x = rest.remove(i);
            for (List<Integer> p : perms(rest)) {
                p.add(0, x);
                out.add(p);
            }
        }
        return out;
    }
}
