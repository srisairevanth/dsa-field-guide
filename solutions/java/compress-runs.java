class Solution {
    public String compressRuns(String s) {
        StringBuilder out = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) j++;
            out.append(s.charAt(i)).append(j - i);
            i = j;
        }
        return out.toString();
    }
}
