import java.util.*;

class Solution {
    public int countBinarySubstrings(String s) {
        List<Integer> runs = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) j++;
            runs.add(j - i);
            i = j;
        }
        int total = 0;
        for (int k = 0; k + 1 < runs.size(); k++) total += Math.min(runs.get(k), runs.get(k + 1));
        return total;
    }
}
