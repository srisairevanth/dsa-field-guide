import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        List<List<Integer>> out = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            int lo = i + 1, hi = arr.length - 1;
            while (lo < hi) {
                int s = arr[i] + arr[lo] + arr[hi];
                if (s == 0) {
                    out.add(List.of(arr[i], arr[lo], arr[hi]));
                    lo++;
                    hi--;
                    while (lo < hi && arr[lo] == arr[lo - 1]) lo++;
                } else if (s < 0) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }
        return out;
    }
}
