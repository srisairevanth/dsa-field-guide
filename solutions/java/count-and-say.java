class Solution {
    public String countAndSay(int n) {
        String term = "1";
        for (int step = 1; step < n; step++) {
            StringBuilder out = new StringBuilder();
            int i = 0;
            while (i < term.length()) {
                int j = i;
                while (j < term.length() && term.charAt(j) == term.charAt(i)) j++;
                out.append(j - i).append(term.charAt(i));
                i = j;
            }
            term = out.toString();
        }
        return term;
    }
}
