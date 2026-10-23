class Solution {
    public int fixedPoint(int[] nums) {
        int lo = 0, hi = nums.length - 1, answer = -1;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            if (nums[mid] == mid) {
                answer = mid;
                hi = mid - 1;
            } else if (nums[mid] < mid) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return answer;
    }
}
