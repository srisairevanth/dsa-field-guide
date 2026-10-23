class Solution {
    public boolean[] kidsWithCandies(int[] candies, int extra) {
        int top = Integer.MIN_VALUE;
        for (int c : candies) top = Math.max(top, c);
        boolean[] out = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) out[i] = candies[i] + extra >= top;
        return out;
    }
}
