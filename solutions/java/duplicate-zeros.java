class Solution {
    public int[] duplicateZeros(int[] arr) {
        int[] out = new int[arr.length];
        int k = 0;
        for (int x : arr) {
            if (k >= arr.length) break;
            out[k++] = x;
            if (x == 0 && k < arr.length) out[k++] = 0;
        }
        return out;
    }
}
