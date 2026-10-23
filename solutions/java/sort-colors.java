import java.util.*;

class Solution {
    public int[] sortColors(int[] tiles) {
        int[] out = tiles.clone();
        Arrays.sort(out);
        return out;
    }
}
