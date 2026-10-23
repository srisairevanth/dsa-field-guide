import java.util.*;

class Solution {
    public int maxMeetings(int[][] meetings) {
        int[][] sorted = meetings.clone();
        Arrays.sort(sorted, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 0;
        long lastEnd = Long.MIN_VALUE;
        for (int[] m : sorted) {
            if (m[0] > lastEnd) {
                count++;
                lastEnd = m[1];
            }
        }
        return count;
    }
}
