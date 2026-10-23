class Solution {
    public long[] rangeSums(int[] sales, int[][] queries) {
        long[] prefix = new long[sales.length + 1];
        for (int i = 0; i < sales.length; i++) prefix[i + 1] = prefix[i] + sales[i];
        long[] out = new long[queries.length];
        for (int k = 0; k < queries.length; k++) out[k] = prefix[queries[k][1] + 1] - prefix[queries[k][0]];
        return out;
    }
}
