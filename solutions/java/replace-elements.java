class Solution {
    public int[] replaceElements(int[] arr) {
        int[] out = new int[arr.length];
        int best = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            out[i] = best;
            best = Math.max(best, arr[i]);
        }
        return out;
    }
}
