class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') i++;
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }
        long value = 0;
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            value = value * 10 + (s.charAt(i) - '0');
            if (value > 2147483648L) value = 2147483648L;
            i++;
        }
        value = sign * value;
        return (int) Math.max(Integer.MIN_VALUE, Math.min(Integer.MAX_VALUE, value));
    }
}
