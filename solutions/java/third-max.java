import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> distinct = new TreeSet<>();
        for (int x : nums) distinct.add(x);
        List<Integer> top = new ArrayList<>(distinct.descendingSet());
        return top.size() >= 3 ? top.get(2) : top.get(0);
    }
}
