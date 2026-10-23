class Solution {
    public int countOnes(int n) {
        long m = Math.abs((long) n);
        int count = 0;
        while (m != 0) {
            count += (int) (m & 1);
            m >>= 1;
        }
        return count;
    }
}
