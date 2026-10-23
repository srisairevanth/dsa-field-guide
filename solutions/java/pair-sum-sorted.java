class Solution {
    public int[] pairSumSorted(int[] values, int target) {
        int i = 0, j = values.length - 1;
        while (i < j) {
            long s = (long) values[i] + values[j];
            if (s == target) return new int[] { i, j };
            if (s < target) i++;
            else j--;
        }
        return new int[0];
    }
}
