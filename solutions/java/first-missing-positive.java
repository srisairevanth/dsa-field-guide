class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] arr = nums.clone();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] >= 1 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int j = arr[i] - 1;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) return i + 1;
        }
        return n + 1;
    }
}
