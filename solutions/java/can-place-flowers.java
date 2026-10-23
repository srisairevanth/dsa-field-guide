class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] plots = new int[flowerbed.length + 2];
        for (int i = 0; i < flowerbed.length; i++) plots[i + 1] = flowerbed[i];
        int placed = 0;
        for (int i = 1; i < plots.length - 1; i++) {
            if (plots[i - 1] == 0 && plots[i] == 0 && plots[i + 1] == 0) {
                plots[i] = 1;
                placed++;
            }
        }
        return placed >= n;
    }
}
