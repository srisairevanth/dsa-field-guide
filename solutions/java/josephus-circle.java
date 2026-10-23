class Solution {
    public int josephusSurvivor(int n, int k) {
        long survivor = 0;
        for (int i = 2; i <= n; i++) survivor = (survivor + k) % i;
        return (int) (survivor + 1);
    }
}
